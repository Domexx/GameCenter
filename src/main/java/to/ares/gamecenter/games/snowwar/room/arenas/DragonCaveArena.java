package to.ares.gamecenter.games.snowwar.room.arenas;

import com.eu.habbo.Emulator;
import to.ares.gamecenter.games.snowwar.room.items.AdsBackgroundItem;
import to.ares.gamecenter.games.snowwar.room.items.SnowBallPileItem;
import to.ares.gamecenter.games.snowwar.room.items.SnowIceBlockItem;
import to.ares.gamecenter.games.snowwar.room.items.GameItem;
import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.data.MapData;
import to.ares.gamecenter.games.snowwar.objects.BaseObject;
import to.ares.gamecenter.games.snowwar.objects.PileObject;
import to.ares.gamecenter.games.snowwar.room.pathfinding.SpawnPoint;

import java.util.Map;

public class DragonCaveArena extends BaseArena {
	public DragonCaveArena() {
		GameItem item;

		arenaType = 9;
		arenaHeight = 50;
		arenaWidth = 50;
		heightMap = "" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxx000000000000000xxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxx00000000000000000xxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxx0000000000000000000xxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxx000000000000000000000xxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxx00000000000000000000000xxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxx0000000000000000000000000xxxxxxxxxxxxxxxx\r" +
				"xxxxxxxx000000000000000000000000000xxxxxxxxxxxxxxx\r" +
				"xxxxxxx00000000000000000000000000000xxxxxxxxxxxxxx\r" +
				"xxxxxx0000000000000000000000000000000xxxxxxxxxxxxx\r" +
				"xxxxx000000000000000000000000000000000xxxxxxxxxxxx\r" +
				"xxxxx0000000000000000000000000000000000xxxxxxxxxxx\r" +
				"xxxxx00000000000000000000000000000000000xxxxxxxxxx\r" +
				"xxxxx000000000000000000000000000000000000xxxxxxxxx\r" +
				"xxxxx0000000000000000000000000000000000000xxxxxxxx\r" +
				"xxxxx00000000000000000000000000000000000000xxxxxxx\r" +
				"xxxxx000000000000000000000000000000000000000xxxxxx\r" +
				"xxxxx0000000000000000000000000000000000000000xxxxx\r" +
				"0xxxx00000000000000000000000000000000000000000xxxx\r" +
				"xxxxx00000000000000000000000000000000000000000xxxx\r" +
				"xxxxx00000000000000000000000000000000000000000xxxx\r" +
				"xxxxx000000000000000000000000000000000000000000xxx\r" +
				"xxxxx000000000000000000000000000000000000000000xxx\r" +
				"xxxxx000000000000000000000000000000000000000000xxx\r" +
				"xxxxxx00000000000000000000000000000000000000000xxx\r" +
				"xxxxxxx0000000000000000000000000000000000000000xxx\r" +
				"xxxxxxxx0000000000000000000000000000000000000xxxxx\r" +
				"xxxxxxxxx00000000000000000000000000000000000xxxxxx\r" +
				"xxxxxxxxxx000000000000000000000000000000000xxxxxxx\r" +
				"xxxxxxxxxxx00000000000000000000000000000000xxxx0xx\r" +
				"xxxxxxxxxxxx0000000000000000000000000000000xxxxxxx\r" +
				"xxxxxxxxxxxxx00000000000000000000000000000xxxxxxxx\r" +
				"xxxxxxxxxxxxxx0000000000000000000000000000xxxxxxxx\r" +
				"xxxxxxxxxxxxxxx00000000000000000000000000xxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxx0000000000000000000000000xxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxx00000000000000000000000xxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxx0000000000000000000000xxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxx00000000000000000000xxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxx000000000000000xxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxx0000000000000xxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxx00000000000xxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxx0000000xxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r";

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 0;
		item.X = 9;
		item.Y = 14;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 1;
		item.X = 22;
		item.Y = 27;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 2;
		item.X = 8;
		item.Y = 20;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 3;
		item.X = 8;
		item.Y = 26;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 4;
		item.X = 35;
		item.Y = 30;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 5;
		item.X = 22;
		item.Y = 17;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 6;
		item.X = 9;
		item.Y = 17;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 7;
		item.X = 35;
		item.Y = 24;
		item.Rot = 4;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 8;
		item.X = 36;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 9;
		item.X = 24;
		item.Y = 21;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 10;
		item.X = 22;
		item.Y = 25;
		item.Rot = 4;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 11;
		item.X = 18;
		item.Y = 21;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 12;
		item.X = 8;
		item.Y = 23;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 13;
		item.X = 36;
		item.Y = 27;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 14;
		item.X = 9;
		item.Y = 20;
		item.Rot = 6;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 15;
		item.X = 36;
		item.Y = 21;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 16;
		item.X = 28;
		item.Y = 21;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 17;
		item.X = 35;
		item.Y = 15;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 18;
		item.X = 9;
		item.Y = 29;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 19;
		item.X = 35;
		item.Y = 18;
		item.Rot = 6;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 20;
		item.X = 22;
		item.Y = 21;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 21;
		item.X = 9;
		item.Y = 23;
		item.Rot = 4;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 22;
		item.X = 36;
		item.Y = 30;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 23;
		item.X = 22;
		item.Y = 23;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 24;
		item.X = 22;
		item.Y = 19;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 25;
		item.X = 8;
		item.Y = 14;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 26;
		item.X = 36;
		item.Y = 15;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 27;
		item.X = 35;
		item.Y = 27;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 28;
		item.X = 35;
		item.Y = 21;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 29;
		item.X = 26;
		item.Y = 21;
		item.Rot = 6;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 30;
		item.X = 8;
		item.Y = 17;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 31;
		item.X = 22;
		item.Y = 15;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowIceBlockItem();
		item.baseItem.allowWalk= false;
		item.baseItem.height = 1.0f;
		item.itemId = 32;
		item.X = 9;
		item.Y = 26;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 33;
		item.X = 16;
		item.Y = 21;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 34;
		item.X = 20;
		item.Y = 21;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 35;
		item.X = 36;
		item.Y = 24;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new AdsBackgroundItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.baseItem.itemExtraType = MapData.TYPE_ID;
		item.itemId = 36;
		item.X = 0;
		item.Y = 22;
		item.Rot = 1;
		item.Z = 0;
		item.extraData = new MapData("state=0\toffsetX=-1070\toffsetZ=9920\toffsetY=1520\timageUrl=" + Emulator.getConfig().getValue("gamecenter.snowwar.dragoncave.bg"));
		fuseObjects.add(item);

		item = new GameItem();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk= true;
		item.baseItem.height = 0.0f;
		item.itemId = 37;
		item.X = 8;
		item.Y = 29;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		spawnsBlue.add(new SpawnPoint(10,10));
		spawnsRed.add(new SpawnPoint(11,11));
	}

	@Override
	public void gameObjects(final Map<Integer, BaseObject> gameObjects, SnowWarRoom room) {
		gameObjects.put(0, new PileObject(22, 27, 12, 12, 1, room.map, room));
		gameObjects.put(1, new PileObject(8, 20, 12, 12, 2, room.map, room));
		gameObjects.put(2, new PileObject(8, 26, 12, 12, 3, room.map, room));
		gameObjects.put(3, new PileObject(36, 18, 12, 12, 8, room.map, room));
		gameObjects.put(4, new PileObject(24, 21, 12, 12, 9, room.map, room));
		gameObjects.put(5, new PileObject(8, 23, 12, 12, 12, room.map, room));
		gameObjects.put(6, new PileObject(36, 27, 12, 12, 13, room.map, room));
		gameObjects.put(7, new PileObject(36, 21, 12, 12, 15, room.map, room));
		gameObjects.put(8, new PileObject(28, 21, 12, 12, 16, room.map, room));
		gameObjects.put(9, new PileObject(36, 30, 12, 12, 22, room.map, room));
		gameObjects.put(10, new PileObject(22, 23, 12, 12, 23, room.map, room));
		gameObjects.put(11, new PileObject(22, 19, 12, 12, 24, room.map, room));
		gameObjects.put(12, new PileObject(8, 14, 12, 12, 25, room.map, room));
		gameObjects.put(13, new PileObject(36, 15, 12, 12, 26, room.map, room));
		gameObjects.put(14, new PileObject(22, 15, 12, 12, 31, room.map, room));
		gameObjects.put(15, new PileObject(16, 21, 12, 12, 33, room.map, room));
		gameObjects.put(16, new PileObject(20, 21, 12, 12, 34, room.map, room));
		gameObjects.put(17, new PileObject(36, 24, 12, 12, 35, room.map, room));
		gameObjects.put(18, new PileObject(8, 29, 12, 12, 37, room.map, room));
	}
}
