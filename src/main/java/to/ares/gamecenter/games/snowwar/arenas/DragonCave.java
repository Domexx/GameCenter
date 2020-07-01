package to.ares.gamecenter.games.snowwar.arenas;

import com.eu.habbo.Emulator;
import to.ares.gamecenter.games.snowwar.Arena;
import to.ares.gamecenter.games.snowwar.GameFuseObject;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.items.BaseItem;
import to.ares.gamecenter.games.snowwar.items.MapStuffData;
import to.ares.gamecenter.games.snowwar.objects.GameItemObject;
import to.ares.gamecenter.games.snowwar.objects.PileGameObject;
import to.ares.gamecenter.games.snowwar.pathfinding.SpawnPoint;

import java.util.Map;

public class DragonCave extends Arena {
	public DragonCave() {
		GameFuseObject Item;

		ArenaType = 9;
		ArenaHeight = 50;
		ArenaWidth = 50;
		HeightMap = "" +
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

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 0;
		Item.X = 9;
		Item.Y = 14;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 1;
		Item.X = 22;
		Item.Y = 27;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 2;
		Item.X = 8;
		Item.Y = 20;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 3;
		Item.X = 8;
		Item.Y = 26;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 4;
		Item.X = 35;
		Item.Y = 30;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 5;
		Item.X = 22;
		Item.Y = 17;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 6;
		Item.X = 9;
		Item.Y = 17;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 7;
		Item.X = 35;
		Item.Y = 24;
		Item.Rot = 4;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 8;
		Item.X = 36;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 9;
		Item.X = 24;
		Item.Y = 21;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 10;
		Item.X = 22;
		Item.Y = 25;
		Item.Rot = 4;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 11;
		Item.X = 18;
		Item.Y = 21;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 12;
		Item.X = 8;
		Item.Y = 23;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 13;
		Item.X = 36;
		Item.Y = 27;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 14;
		Item.X = 9;
		Item.Y = 20;
		Item.Rot = 6;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 15;
		Item.X = 36;
		Item.Y = 21;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 16;
		Item.X = 28;
		Item.Y = 21;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 17;
		Item.X = 35;
		Item.Y = 15;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 18;
		Item.X = 9;
		Item.Y = 29;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 19;
		Item.X = 35;
		Item.Y = 18;
		Item.Rot = 6;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 20;
		Item.X = 22;
		Item.Y = 21;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 21;
		Item.X = 9;
		Item.Y = 23;
		Item.Rot = 4;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 22;
		Item.X = 36;
		Item.Y = 30;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 23;
		Item.X = 22;
		Item.Y = 23;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 24;
		Item.X = 22;
		Item.Y = 19;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 25;
		Item.X = 8;
		Item.Y = 14;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 26;
		Item.X = 36;
		Item.Y = 15;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 27;
		Item.X = 35;
		Item.Y = 27;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 28;
		Item.X = 35;
		Item.Y = 21;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 29;
		Item.X = 26;
		Item.Y = 21;
		Item.Rot = 6;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 30;
		Item.X = 8;
		Item.Y = 17;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 31;
		Item.X = 22;
		Item.Y = 15;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_iceblock;
		Item.baseItem.allowWalk= false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 32;
		Item.X = 9;
		Item.Y = 26;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 33;
		Item.X = 16;
		Item.Y = 21;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 34;
		Item.X = 20;
		Item.Y = 21;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 35;
		Item.X = 36;
		Item.Y = 24;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.ads_background;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.baseItem.itemExtraType = MapStuffData.TYPE_ID;
		Item.itemId = 36;
		Item.X = 0;
		Item.Y = 22;
		Item.Rot = 1;
		Item.Z = 0;
		Item.extraData = new MapStuffData("state=0\toffsetX=-1070\toffsetZ=9920\toffsetY=1520\timageUrl=" + Emulator.getConfig().getValue("gamecenter.snowwar.dragoncave.bg"));
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk= true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 37;
		Item.X = 8;
		Item.Y = 29;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		spawnsBLUE.add(new SpawnPoint(10,10));
		spawnsRED.add(new SpawnPoint(11,11));
	}

	@Override
	public void gameObjects(final Map<Integer, GameItemObject> gameObjects, SnowWarRoom room) {
		gameObjects.put(0, new PileGameObject(22, 27, 12, 12, 1, room.map, room));
		gameObjects.put(1, new PileGameObject(8, 20, 12, 12, 2, room.map, room));
		gameObjects.put(2, new PileGameObject(8, 26, 12, 12, 3, room.map, room));
		gameObjects.put(3, new PileGameObject(36, 18, 12, 12, 8, room.map, room));
		gameObjects.put(4, new PileGameObject(24, 21, 12, 12, 9, room.map, room));
		gameObjects.put(5, new PileGameObject(8, 23, 12, 12, 12, room.map, room));
		gameObjects.put(6, new PileGameObject(36, 27, 12, 12, 13, room.map, room));
		gameObjects.put(7, new PileGameObject(36, 21, 12, 12, 15, room.map, room));
		gameObjects.put(8, new PileGameObject(28, 21, 12, 12, 16, room.map, room));
		gameObjects.put(9, new PileGameObject(36, 30, 12, 12, 22, room.map, room));
		gameObjects.put(10, new PileGameObject(22, 23, 12, 12, 23, room.map, room));
		gameObjects.put(11, new PileGameObject(22, 19, 12, 12, 24, room.map, room));
		gameObjects.put(12, new PileGameObject(8, 14, 12, 12, 25, room.map, room));
		gameObjects.put(13, new PileGameObject(36, 15, 12, 12, 26, room.map, room));
		gameObjects.put(14, new PileGameObject(22, 15, 12, 12, 31, room.map, room));
		gameObjects.put(15, new PileGameObject(16, 21, 12, 12, 33, room.map, room));
		gameObjects.put(16, new PileGameObject(20, 21, 12, 12, 34, room.map, room));
		gameObjects.put(17, new PileGameObject(36, 24, 12, 12, 35, room.map, room));
		gameObjects.put(18, new PileGameObject(8, 29, 12, 12, 37, room.map, room));
	}
}
