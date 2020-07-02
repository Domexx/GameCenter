package to.ares.gamecenter.games.snowwar;

import to.ares.gamecenter.games.snowwar.arenas.BaseArena;
import to.ares.gamecenter.games.snowwar.data.GameFuseObject;
import to.ares.gamecenter.games.snowwar.objects.GameItemObject;
import to.ares.gamecenter.games.snowwar.pathfinding.Direction8;
import to.ares.gamecenter.games.snowwar.pathfinding.PlayerTile;
import to.ares.gamecenter.games.snowwar.pathfinding.Tile;

import java.util.List;

public class SnowWarGameStage {
    private static int _0Fs = 100000;
    private Tile[][] tileMap;

    public void initialize(BaseArena arena) {
        buildMap(arena);
        addObjects(arena.fuseObjects);
    }

    public void _2Av(GameItemObject gameItemObject) {
        final PlayerTile playerTile = gameItemObject.location3D();
        final Tile tile = getTile(Tile._4mC(playerTile.x()), Tile._3FS(playerTile.y()));

        if (tile != null) {
            tile._1tH(gameItemObject);
        }
    }

    public boolean checkFloorCollision(GameItemObject gameItemObject) {
        if (gameItemObject.location3D().z() < 1) {
            return (true);
        }
        final int local1 = Tile._4mC(gameItemObject.location3D().x());
        final int local2 = Tile._3FS(gameItemObject.location3D().y());
        final Tile local3 = getTile(local1, local2);
        if (local3 != null) {
            return ((gameItemObject.location3D().z() < local3.height()));
        }
        return (false);
    }

    public Tile getTile(int x, int y) {
        if (x < 0 || x >= tileMap[0].length ||
                y < 0 || y >= tileMap.length) {
            return (null);
        }
        return (tileMap[y][x]);
    }

    private void addObjects(List<GameFuseObject> objects) {
        for (final GameFuseObject object : objects) {
            final Tile tile = getTile(object.X, object.Y);
            if (tile != null) {
                tile._lR(object);
                setupTile(object);
            }
        }
    }

    private void setupTile(GameFuseObject object) {
        Tile local1;
        int local5;
        int local6;
        final int local2 = object.Rot;
        int local3 = object.baseItem.xDim;
        int local4 = object.baseItem.yDim;

        if ((((local2 == Direction8.E.getRot())) || ((local2 == Direction8.W.getRot())))) {
            local6 = local3;
            local3 = local4;
            local4 = local6;
        }

        local5 = 1 /* 0 */;

        while (local5 < local3) {
            local1 = getTile((object.X + local5), object.Y);

            if (local1 != null) {
                local1._4AO((int) (object.baseItem.height * Tile.TILE_SIZE));
                if (!object.baseItem.allowWalk) {
                    local1.setBlocked(true);
                }
            }
            local5++;
        }
        local5 = 1;
        while (local5 < local4) {
            local1 = getTile(object.X, (object.Y + local5));
            if (local1 != null) {
                local1._4AO((int) (object.baseItem.height * Tile.TILE_SIZE));
                if (!object.baseItem.allowWalk) {
                    local1.setBlocked(true);
                }
            }
            local5++;
        }
    }

    private void buildMap(BaseArena arena) {
        Tile local4;
        Tile local7;
        Tile local8;
        Tile local9;
        Tile local10;

        int local6;
        final int[][] local1 = parseHeightMap(arena.heightMap, arena.arenaWidth, arena.arenaHeight);
        final int local2 = arena.arenaHeight;
        final int local3 = arena.arenaWidth;
        tileMap = new Tile[arena.arenaHeight][];
        int local5 = 0;

        while (local5 < local2) {
            tileMap[local5] = new Tile[arena.arenaWidth];
            local6 = 0;

            while (local6 < local3) {
                tileMap[local5][local6] = null;

                if (local1[local5][local6] != _0Fs) {
                    local4 = new Tile(local6, local5);
                    tileMap[local5][local6] = local4;
                    local7 = getTile((local6 + 1), (local5 - 1));

                    if (local7 != null) {
                        local4._3iT(local7, Direction8.NE);
                    }

                    local8 = getTile(local6, (local5 - 1));

                    if (local8 != null) {
                        local4._3iT(local8, Direction8.N);
                    }

                    local9 = getTile((local6 - 1), (local5 - 1));

                    if (local9 != null) {
                        local4._3iT(local9, Direction8.NW);
                    }

                    local10 = getTile((local6 - 1), local5);

                    if (local10 != null) {
                        local4._3iT(local10, Direction8.W);
                    }
                }
                local6++;
            }
            local5++;
        }
    }

    private int[][] parseHeightMap(String heightMap, int arenaWidth, int arenaHeight) {
        String local7;
        String local9;

        int local6 = 0;
        int local3 = 0;
        int local8;

        final String[] local4 = heightMap.split("\r");
        final int[][] local5 = new int[local4.length][];

        while (local6 < local4.length) {
            local7 = local4[local6];
            local5[local6] = new int[local7.length()];
            local8 = (local7.length() - 1);

            while (local8 >= 0) {
                local9 = local7.substring(local8, local8 + 1);//""+local7.charAt(local8);

                if (local9.equals("x")) {
                    local5[local6][local8] = _0Fs;
                } else {
                    try {
                        local5[local6][local8] = Integer.parseInt(local9);
                    } catch (final Exception ex) {
                        local5[local6][local8] = (10 + (local9.charAt(0) - 'a'));
                    }
                }

                if ((((local5[local6][local8] > local3)) && (!((local5[local6][local8] == _0Fs))))) {
                    local3 = local5[local6][local8];
                }
                local8--;
            }
            local6++;
        }
        return (local5);
    }
}

