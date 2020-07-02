package to.ares.gamecenter.games.snowwar.arenas;

import com.eu.habbo.Emulator;
import to.ares.gamecenter.games.snowwar.arenas.items.*;
import to.ares.gamecenter.games.snowwar.data.GameFuseObject;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.data.MapData;
import to.ares.gamecenter.games.snowwar.objects.GameItemObject;
import to.ares.gamecenter.games.snowwar.objects.PileGameObject;
import to.ares.gamecenter.games.snowwar.objects.TreeGameObject;
import to.ares.gamecenter.games.snowwar.pathfinding.SpawnPoint;

import java.util.Map;

public class FightNightArena extends Arena {
	public FightNightArena() {
		GameFuseObject item;

		arenaType = 11;
		arenaWidth = 50;
		arenaHeight = 50;
		heightMap = "" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxx00000000xxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxx00000000000xxxxxxxxxxxxxxxxxxxxxx\r" +
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
				"xxxx00000000000000000000000000000000000000xxxxxxxx\r" +
				"xxxx000000000000000000000000000000000000000xxxxxxx\r" +
				"xxxx0000000000000000000000000000000000000000xxxxxx\r" +
				"xxxx00000000000000000000000000000000000000000xxxxx\r" +
				"0xxx000000000000000000000000000000000000000000xxxx\r" +
				"xxxx000000000000000000000000000000000000000000xxxx\r" +
				"xxxx0000000000000000000000000000000000000000000xxx\r" +
				"xxxx0000000000000000000000000000000000000000000xxx\r" +
				"xxxx0000000000000000000000000000000000000000000xxx\r" +
				"xxxxx000000000000000000000000000000000000000000xxx\r" +
				"xxxxxx00000000000000000000000000000000000000000xxx\r" +
				"xxxxxxx0000000000000000000000000000000000000000xxx\r" +
				"xxxxxxxx000000000000000000000000000000000000000xxx\r" +
				"xxxxxxxxx0000000000000000000000000000000000000xxxx\r" +
				"xxxxxxxxxx000000000000000000000000000000000000xxxx\r" +
				"xxxxxxxxxxx0000000000000000000000000000000000xxxxx\r" +
				"xxxxxxxxxxxx00000000000000000000000000000000xxxxxx\r" +
				"xxxxxxxxxxxxx000000000000000000000000000000xxxxxxx\r" +
				"xxxxxxxxxxxxxx0000000000000000000000000000xxxxxxxx\r" +
				"xxxxxxxxxxxxxxx00000000000000000000000000xxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxx0000000000000000000000000xxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxx00000000000000000000000xxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxx0000000000000000000000xxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxx00000000000000000000xxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxx000000000000000000xxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxx0000000000000000xxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxx0000000000000xxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxx000000000xxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxx000000xxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r";

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 0;
		item.X = 29;
		item.Y = 23;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 1;
		item.X = 11;
		item.Y = 16;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 2;
		item.X = 26;
		item.Y = 28;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 3;
		item.X = 31;
		item.Y = 42;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk = true;
		item.baseItem.height = 0.0f;
		item.itemId = 4;
		item.X = 27;
		item.Y = 16;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 5;
		item.X = 32;
		item.Y = 10;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("1");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 6;
		item.X = 13;
		item.Y = 21;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 7;
		item.X = 33;
		item.Y = 14;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk = true;
		item.baseItem.height = 0.0f;
		item.itemId = 8;
		item.X = 18;
		item.Y = 14;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 9;
		item.X = 15;
		item.Y = 36;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("1");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 10;
		item.X = 34;
		item.Y = 17;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("2");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 11;
		item.X = 17;
		item.Y = 33;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("2");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBlockItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 12;
		item.X = 27;
		item.Y = 17;
		item.Rot = 4;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk = true;
		item.baseItem.height = 0.0f;
		item.itemId = 13;
		item.X = 31;
		item.Y = 12;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 14;
		item.X = 34;
		item.Y = 42;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("2");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 15;
		item.X = 41;
		item.Y = 31;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 16;
		item.X = 9;
		item.Y = 20;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 17;
		item.X = 30;
		item.Y = 39;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("1");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBlockItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 18;
		item.X = 21;
		item.Y = 27;
		item.Rot = 6;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk = true;
		item.baseItem.height = 0.0f;
		item.itemId = 19;
		item.X = 27;
		item.Y = 12;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBlockItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 20;
		item.X = 22;
		item.Y = 28;
		item.Rot = 4;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 21;
		item.X = 13;
		item.Y = 31;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 22;
		item.X = 10;
		item.Y = 30;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk = true;
		item.baseItem.height = 0.0f;
		item.itemId = 23;
		item.X = 22;
		item.Y = 35;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk = true;
		item.baseItem.height = 0.0f;
		item.itemId = 24;
		item.X = 21;
		item.Y = 28;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new XmasManAItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 25;
		item.X = 14;
		item.Y = 9;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 26;
		item.X = 40;
		item.Y = 34;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("1");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 27;
		item.X = 42;
		item.Y = 21;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk = true;
		item.baseItem.height = 0.0f;
		item.itemId = 28;
		item.X = 27;
		item.Y = 32;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 29;
		item.X = 25;
		item.Y = 20;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("2");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 30;
		item.X = 36;
		item.Y = 14;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 31;
		item.X = 11;
		item.Y = 26;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 32;
		item.X = 39;
		item.Y = 36;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("1");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 33;
		item.X = 25;
		item.Y = 24;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk = true;
		item.baseItem.height = 0.0f;
		item.itemId = 34;
		item.X = 22;
		item.Y = 13;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 35;
		item.X = 13;
		item.Y = 13;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 2
		item.baseItem = new SnowFenceItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 36;
		item.X = 19;
		item.Y = 22;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 37;
		item.X = 28;
		item.Y = 9;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("1");
		fuseObjects.add(item);

		item = new GameFuseObject();// 2
		item.baseItem = new SnowFenceItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 38;
		item.X = 34;
		item.Y = 26;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("1");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 39;
		item.X = 19;
		item.Y = 11;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("1");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk = true;
		item.baseItem.height = 0.0f;
		item.itemId = 40;
		item.X = 32;
		item.Y = 20;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 41;
		item.X = 29;
		item.Y = 44;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 42;
		item.X = 43;
		item.Y = 27;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 43;
		item.X = 19;
		item.Y = 36;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 44;
		item.X = 29;
		item.Y = 26;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("1");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new XmasManCItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 45;
		item.X = 14;
		item.Y = 9;
		item.Rot = 4;
		item.Z = 2480;
		item.extraData.setExtraData("6");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new AdsBackgroundItem();
		item.baseItem.allowWalk = true;
		item.baseItem.height = 0.0f;
		item.baseItem.itemExtraType = MapData.TYPE_ID;
		item.itemId = 46;
		item.X = 0;
		item.Y = 22;
		item.Rot = 1;
		item.Z = 0;
		item.extraData = new MapData("state=0\toffsetX=-1119\toffsetZ=9950\toffsetY=390\timageUrl=" + Emulator.getConfig().getValue("gamecenter.snowwar.fightnight.bg"));
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 47;
		item.X = 14;
		item.Y = 17;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 48;
		item.X = 24;
		item.Y = 9;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 49;
		item.X = 22;
		item.Y = 20;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 2
		item.baseItem = new SnowFenceItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 50;
		item.X = 17;
		item.Y = 22;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("1");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBlockItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 51;
		item.X = 26;
		item.Y = 16;
		item.Rot = 6;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk = true;
		item.baseItem.height = 0.0f;
		item.itemId = 52;
		item.X = 17;
		item.Y = 29;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBlockItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 53;
		item.X = 22;
		item.Y = 27;
		item.Rot = 6;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 54;
		item.X = 37;
		item.Y = 40;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 55;
		item.X = 24;
		item.Y = 42;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 56;
		item.X = 17;
		item.Y = 10;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk = true;
		item.baseItem.height = 0.0f;
		item.itemId = 57;
		item.X = 14;
		item.Y = 24;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 58;
		item.X = 20;
		item.Y = 40;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 59;
		item.X = 20;
		item.Y = 8;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBallPileItem();
		item.baseItem.allowWalk = true;
		item.baseItem.height = 0.0f;
		item.itemId = 60;
		item.X = 17;
		item.Y = 35;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowBlockItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 61;
		item.X = 26;
		item.Y = 17;
		item.Rot = 4;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new SnowTreeItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 62;
		item.X = 22;
		item.Y = 24;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 2
		item.baseItem = new SnowFenceItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 63;
		item.X = 30;
		item.Y = 26;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("1");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = new XmasManBItem();
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 64;
		item.X = 14;
		item.Y = 9;
		item.Rot = 4;
		item.Z = 1280;
		item.extraData.setExtraData("5");
		fuseObjects.add(item);

		spawnsBlue.add(new SpawnPoint(10,10));
		spawnsRed.add(new SpawnPoint(11,11));
	}

	@Override
	public void gameObjects(final Map<Integer, GameItemObject> gameObjects, SnowWarRoom room) {
		gameObjects.put(0, new TreeGameObject(29, 23, 0, 1, 0, 3, 0, room.map, room));
		gameObjects.put(1, new TreeGameObject(11, 16, 2, 1, 1, 3, 0, room.map, room));
		gameObjects.put(2, new TreeGameObject(26, 28, 2, 1, 2, 3, 0, room.map, room));
		gameObjects.put(3, new TreeGameObject(31, 42, 2, 1, 3, 3, 0, room.map, room));
		gameObjects.put(4, new PileGameObject(27, 16, 12, 12, 4, room.map, room));
		gameObjects.put(5, new TreeGameObject(32, 10, 0, 1, 5, 3, 1, room.map, room));
		gameObjects.put(6, new TreeGameObject(13, 21, 2, 1, 6, 3, 0, room.map, room));
		gameObjects.put(7, new TreeGameObject(33, 14, 0, 1, 7, 3, 0, room.map, room));
		gameObjects.put(8, new PileGameObject(18, 14, 12, 12, 8, room.map, room));
		gameObjects.put(9, new TreeGameObject(15, 36, 2, 1, 9, 3, 1, room.map, room));
		gameObjects.put(10, new TreeGameObject(34, 17, 0, 1, 10, 3, 2, room.map, room));
		gameObjects.put(11, new TreeGameObject(17, 33, 2, 1, 11, 3, 2, room.map, room));
		gameObjects.put(12, new PileGameObject(31, 12, 12, 12, 13, room.map, room));
		gameObjects.put(13, new TreeGameObject(34, 42, 2, 1, 14, 3, 2, room.map, room));
		gameObjects.put(14, new TreeGameObject(41, 31, 0, 1, 15, 3, 0, room.map, room));
		gameObjects.put(15, new TreeGameObject(9, 20, 2, 1, 16, 3, 0, room.map, room));
		gameObjects.put(16, new TreeGameObject(30, 39, 0, 1, 17, 3, 1, room.map, room));
		gameObjects.put(17, new PileGameObject(27, 12, 12, 12, 19, room.map, room));
		gameObjects.put(18, new TreeGameObject(13, 31, 2, 1, 21, 3, 0, room.map, room));
		gameObjects.put(19, new TreeGameObject(10, 30, 2, 1, 22, 3, 0, room.map, room));
		gameObjects.put(20, new PileGameObject(22, 35, 12, 12, 23, room.map, room));
		gameObjects.put(21, new PileGameObject(21, 28, 12, 12, 24, room.map, room));
		gameObjects.put(22, new TreeGameObject(40, 34, 0, 1, 26, 3, 1, room.map, room));
		gameObjects.put(23, new TreeGameObject(42, 21, 0, 1, 27, 3, 0, room.map, room));
		gameObjects.put(24, new PileGameObject(27, 32, 12, 12, 28, room.map, room));
		gameObjects.put(25, new TreeGameObject(25, 20, 0, 1, 29, 3, 2, room.map, room));
		gameObjects.put(26, new TreeGameObject(36, 15, 0, 1, 30, 3, 0, room.map, room));
		gameObjects.put(27, new TreeGameObject(11, 26, 2, 1, 31, 3, 0, room.map, room));
		gameObjects.put(28, new TreeGameObject(39, 36, 0, 1, 32, 3, 1, room.map, room));
		gameObjects.put(29, new TreeGameObject(25, 24, 0, 1, 33, 3, 0, room.map, room));
		gameObjects.put(30, new PileGameObject(22, 13, 12, 12, 34, room.map, room));
		gameObjects.put(31, new TreeGameObject(13, 13, 0, 1, 35, 3, 0, room.map, room));
		gameObjects.put(32, new TreeGameObject(28, 9, 0, 1, 37, 3, 1, room.map, room));
		gameObjects.put(33, new TreeGameObject(19, 11, 0, 1, 39, 3, 1, room.map, room));
		gameObjects.put(34, new PileGameObject(32, 20, 12, 12, 40, room.map, room));
		gameObjects.put(35, new TreeGameObject(29, 44, 2, 1, 41, 3, 0, room.map, room));
		gameObjects.put(36, new TreeGameObject(43, 27, 0, 1, 42, 3, 0, room.map, room));
		gameObjects.put(37, new TreeGameObject(19, 36, 2, 1, 43, 3, 0, room.map, room));
		gameObjects.put(38, new TreeGameObject(29, 26, 0, 1, 44, 3, 1, room.map, room));
		gameObjects.put(39, new TreeGameObject(14, 17, 2, 1, 47, 3, 0, room.map, room));
		gameObjects.put(40, new TreeGameObject(24, 9, 0, 1, 48, 3, 0, room.map, room));
		gameObjects.put(41, new TreeGameObject(23, 20, 0, 1, 49, 3, 0, room.map, room));
		gameObjects.put(42, new PileGameObject(17, 29, 12, 12, 52, room.map, room));
		gameObjects.put(43, new TreeGameObject(37, 40, 2, 1, 54, 3, 0, room.map, room));
		gameObjects.put(44, new TreeGameObject(24, 42, 2, 1, 55, 3, 0, room.map, room));
		gameObjects.put(45, new TreeGameObject(17, 10, 0, 1, 56, 3, 0, room.map, room));
		gameObjects.put(46, new PileGameObject(14, 24, 12, 12, 57, room.map, room));
		gameObjects.put(47, new TreeGameObject(20, 40, 2, 1, 58, 3, 0, room.map, room));
		gameObjects.put(48, new TreeGameObject(20, 8, 0, 1, 59, 3, 0, room.map, room));
		gameObjects.put(49, new PileGameObject(17, 35, 12, 12, 60, room.map, room));
		gameObjects.put(50, new TreeGameObject(22, 24, 2, 1, 62, 3, 0, room.map, room));
	}
}
