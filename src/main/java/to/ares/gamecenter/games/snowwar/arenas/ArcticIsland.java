package to.ares.gamecenter.games.snowwar.arenas;

import com.eu.habbo.Emulator;
import to.ares.gamecenter.games.snowwar.arenas.items.GameFuseObject;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.arenas.items.BaseItem;
import to.ares.gamecenter.games.snowwar.arenas.items.MapStuffData;
import to.ares.gamecenter.games.snowwar.objects.GameItemObject;
import to.ares.gamecenter.games.snowwar.objects.MachineGameObject;
import to.ares.gamecenter.games.snowwar.objects.TreeGameObject;
import to.ares.gamecenter.games.snowwar.pathfinding.SpawnPoint;

import java.util.Map;

public class ArcticIsland extends Arena {
	public ArcticIsland() {
		GameFuseObject item;

		arenaType = 8;
		arenaHeight = 50;
		arenaWidth = 50;
		heightMap = "" +
				"xxxxxxxxxxxxxxxxxxx00000xxxxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxx0000000xxxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxx000000000xxxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxx00000000000xxxxxxxxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxx0000000000000xxxxxxxxxxxxxxxxxxxxxx\r" +
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
				"xxxx00000000000000000000000000000000000xxxxxxxxxxx\r" +
				"xxx0000000000000000000000000000000000000xxxxxxxxxx\r" +
				"xx000000000000000000000000000000000000000xxxxxxxxx\r" +
				"x00000000000000000000000000000000000000000xxxxxxxx\r" +
				"00000000000000000000xxxxx0xxxxxxx0000000000xxxxxxx\r" +
				"00000000000000000000xxxxx0xxxxxxx00000000000xxxxxx\r" +
				"00000000000000000000xxxxx0xxxxxxx000000000000xxxxx\r" +
				"00000000000000000000xxx0000000xxx0000000000000xxxx\r" +
				"x0000000000000000000xxx0000000xxx00000000000000xxx\r" +
				"xx000000000000000000xxx0000000000000000000000000xx\r" +
				"xxx00000000000000000xxx0000000xxx0000000000000000x\r" +
				"xxxx00000000000000000000000000xxx00000000000000000\r" +
				"xxxxx000000000000000xxx0000000xxx00000000000000000\r" +
				"xxxxxx00000000000000xxxxxxx0xxxxx00000000000000000\r" +
				"xxxxxxx0000000000000xxxxxxx0xxxxx00000000000000000\r" +
				"xxxxxxxx000000000000xxxxxxx0xxxxx00000000000000000\r" +
				"xxxxxxxxx00000000000000000000000000000000000000000\r" +
				"xxxxxxxxxx000000000000000000000000000000000000000x\r" +
				"xxxxxxxxxxx0000000000000000000000000000000000000xx\r" +
				"xxxxxxxxxxxx00000000000000000000000000000000000xxx\r" +
				"xxxxxxxxxxxxx000000000000000000000000000000000xxxx\r" +
				"xxxxxxxxxxxxxx0000000000000000000000000000000xxxxx\r" +
				"xxxxxxxxxxxxxxx00000000000000000000000000000xxxxxx\r" +
				"xxxxxxxxxxxxxxxx000000000000000000000000000xxxxxxx\r" +
				"xxxxxxxxxxxxxxxxx0000000000000000000000000xxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxx00000000000000000000000xxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxx000000000000000000000xxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxx0000000000000000000xxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxx00000000000000000xxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxx000000000000000xxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxx0000000000000xxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxx00000000000xxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxx000000000xxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxx0000000xxxxxxxxxxxxxxxxx\r" +
				"xxxxxxxxxxxxxxxxxxxxxxxxxxx00000xxxxxxxxxxxxxxxxxx\r";

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 0;
		item.X = 41;
		item.Y = 37;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 1;
		item.X = 2;
		item.Y = 20;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 2;
		item.X = 10;
		item.Y = 18;
		item.Rot = 6;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 3;
		item.X = 19;
		item.Y = 41;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 4;
		item.X = 41;
		item.Y = 20;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 5;
		item.X = 9;
		item.Y = 31;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 6;
		item.X = 23;
		item.Y = 44;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 7;
		item.X = 4;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 8;
		item.X = 2;
		item.Y = 20;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 9;
		item.X = 25;
		item.Y = 38;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 10;
		item.X = 2;
		item.Y = 19;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 11;
		item.X = 9;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 12;
		item.X = 7;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 2
		item.baseItem = BaseItem.snst_fence;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 13;
		item.X = 17;
		item.Y = 14;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("2");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 14;
		item.X = 2;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 15;
		item.X = 49;
		item.Y = 28;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 16;
		item.X = 2;
		item.Y = 22;
		item.Rot = 6;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 17;
		item.X = 5;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 18;
		item.X = 4;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 19;
		item.X = 39;
		item.Y = 22;
		item.Rot = 2;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 20;
		item.X = 39;
		item.Y = 23;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 2
		item.baseItem = BaseItem.snst_fence;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 21;
		item.X = 24;
		item.Y = 44;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 22;
		item.X = 36;
		item.Y = 15;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 23;
		item.X = 23;
		item.Y = 44;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 24;
		item.X = 47;
		item.Y = 32;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 25;
		item.X = 39;
		item.Y = 37;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 26;
		item.X = 8;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 27;
		item.X = 2;
		item.Y = 19;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 28;
		item.X = 6;
		item.Y = 20;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 29;
		item.X = 2;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 2
		item.baseItem = BaseItem.snst_fence;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 30;
		item.X = 15;
		item.Y = 14;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 31;
		item.X = 26;
		item.Y = 6;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 32;
		item.X = 39;
		item.Y = 23;
		item.Rot = 4;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 33;
		item.X = 23;
		item.Y = 38;
		item.Rot = 2;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 34;
		item.X = 10;
		item.Y = 26;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 35;
		item.X = 23;
		item.Y = 45;
		item.Rot = 4;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 36;
		item.X = 39;
		item.Y = 21;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 37;
		item.X = 5;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 38;
		item.X = 39;
		item.Y = 24;
		item.Rot = 6;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 39;
		item.X = 13;
		item.Y = 15;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 40;
		item.X = 3;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 2
		item.baseItem = BaseItem.snst_fence;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 41;
		item.X = 13;
		item.Y = 14;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("1");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 42;
		item.X = 30;
		item.Y = 7;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 43;
		item.X = 40;
		item.Y = 20;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 2
		item.baseItem = BaseItem.snst_fence;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 44;
		item.X = 29;
		item.Y = 7;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("1");
		fuseObjects.add(item);

		item = new GameFuseObject();// 2
		item.baseItem = BaseItem.snst_fence;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 45;
		item.X = 21;
		item.Y = 14;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("2");
		fuseObjects.add(item);

		item = new GameFuseObject();// 2
		item.baseItem = BaseItem.snst_fence;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 46;
		item.X = 24;
		item.Y = 40;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 47;
		item.X = 23;
		item.Y = 40;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 48;
		item.X = 15;
		item.Y = 10;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 49;
		item.X = 37;
		item.Y = 37;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 50;
		item.X = 20;
		item.Y = 4;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 51;
		item.X = 3;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 52;
		item.X = 23;
		item.Y = 40;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 53;
		item.X = 2;
		item.Y = 22;
		item.Rot = 2;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 54;
		item.X = 43;
		item.Y = 20;
		item.Rot = 6;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 55;
		item.X = 23;
		item.Y = 39;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 56;
		item.X = 45;
		item.Y = 25;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 57;
		item.X = 23;
		item.Y = 42;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 58;
		item.X = 42;
		item.Y = 20;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 59;
		item.X = 9;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 60;
		item.X = 10;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 2
		item.baseItem = BaseItem.snst_fence;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 61;
		item.X = 24;
		item.Y = 38;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("1");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 62;
		item.X = 11;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 63;
		item.X = 39;
		item.Y = 37;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 64;
		item.X = 8;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 65;
		item.X = 39;
		item.Y = 20;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 66;
		item.X = 38;
		item.Y = 37;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 67;
		item.X = 40;
		item.Y = 37;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 68;
		item.X = 2;
		item.Y = 21;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 2
		item.baseItem = BaseItem.snst_fence;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 69;
		item.X = 24;
		item.Y = 42;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("2");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 70;
		item.X = 39;
		item.Y = 22;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 71;
		item.X = 38;
		item.Y = 37;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 72;
		item.X = 40;
		item.Y = 20;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 73;
		item.X = 28;
		item.Y = 47;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 74;
		item.X = 6;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.s_snowball_machine;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 75;
		item.X = 26;
		item.Y = 24;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 76;
		item.X = 5;
		item.Y = 24;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 77;
		item.X = 41;
		item.Y = 20;
		item.Rot = 4;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 2
		item.baseItem = BaseItem.snst_fence;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 78;
		item.X = 19;
		item.Y = 14;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.ads_background;
		item.baseItem.allowWalk = true;
		item.baseItem.height = 0.0f;
		item.baseItem.itemExtraType = MapStuffData.TYPE_ID;
		item.itemId = 79;
		item.X = 0;
		item.Y = 19;
		item.Rot = 1;
		item.Z = 0;
		item.extraData = new MapStuffData("state=0\toffsetX=-1166\toffsetZ=10000\toffsetY=1542\timageUrl=" + Emulator.getConfig().getValue("gamecenter.snowwar.artic.bg"));
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 80;
		item.X = 20;
		item.Y = 8;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 81;
		item.X = 2;
		item.Y = 21;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 82;
		item.X = 23;
		item.Y = 38;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 83;
		item.X = 23;
		item.Y = 42;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 84;
		item.X = 42;
		item.Y = 20;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 85;
		item.X = 39;
		item.Y = 21;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 86;
		item.X = 12;
		item.Y = 18;
		item.Rot = 4;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 87;
		item.X = 11;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 88;
		item.X = 40;
		item.Y = 37;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 89;
		item.X = 23;
		item.Y = 41;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 90;
		item.X = 43;
		item.Y = 20;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 91;
		item.X = 39;
		item.Y = 20;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_tree1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 92;
		item.X = 15;
		item.Y = 34;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("0");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 93;
		item.X = 6;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 94;
		item.X = 7;
		item.Y = 18;
		item.Rot = 0;
		item.Z = 1440;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 2
		item.baseItem = BaseItem.snst_fence;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.0f;
		item.itemId = 95;
		item.X = 29;
		item.Y = 9;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("2");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 96;
		item.X = 39;
		item.Y = 24;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.snst_block1;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 1.0f;
		item.itemId = 97;
		item.X = 23;
		item.Y = 43;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);


		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.ads_igorraygun;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.1f;
		item.itemId = 98;
		item.X = 28;
		item.Y = 12;
		item.Rot = 4;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.ads_igorraygun;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.1f;
		item.itemId = 99;
		item.X = 41;
		item.Y = 33;
		item.Rot = 6;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.ads_igorraygun;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.1f;
		item.itemId = 100;
		item.X = 31;
		item.Y = 41;
		item.Rot = 0;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.ads_igorraygun;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.1f;
		item.itemId = 101;
		item.X = 17;
		item.Y = 37;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);

		item = new GameFuseObject();// 1
		item.baseItem = BaseItem.ads_igorraygun;
		item.baseItem.allowWalk = false;
		item.baseItem.height = 0.1f;
		item.itemId = 102;
		item.X = 11;
		item.Y = 21;
		item.Rot = 2;
		item.Z = 0;
		item.extraData.setExtraData("");
		fuseObjects.add(item);


		spawnsBlue.add(new SpawnPoint(22,9));
		spawnsBlue.add(new SpawnPoint(25,12));
		spawnsBlue.add(new SpawnPoint(26,8));
		spawnsBlue.add(new SpawnPoint(31,14));
		spawnsBlue.add(new SpawnPoint(23,13));

		spawnsRed.add(new SpawnPoint(30,43));
		spawnsRed.add(new SpawnPoint(33,42));
		spawnsRed.add(new SpawnPoint(38,41));
		spawnsRed.add(new SpawnPoint(26,42));
		spawnsRed.add(new SpawnPoint(33,46));
	}

	@Override
	public void gameObjects(final Map<Integer, GameItemObject> gameObjects, SnowWarRoom room) {
		gameObjects.put(0, new TreeGameObject(19, 41, 0, 1, 3, 3, 0, room.map, room));
		gameObjects.put(1, new TreeGameObject(9, 31, 0, 1, 5, 3, 0, room.map, room));
		gameObjects.put(2, new TreeGameObject(25, 38, 0, 1, 9, 3, 0, room.map, room));
		gameObjects.put(3, new TreeGameObject(49, 28, 0, 1, 15, 3, 0, room.map, room));
		gameObjects.put(4, new TreeGameObject(36, 15, 0, 1, 22, 3, 0, room.map, room));
		gameObjects.put(5, new TreeGameObject(47, 32, 0, 1, 24, 3, 0, room.map, room));
		gameObjects.put(6, new TreeGameObject(6, 20, 0, 1, 28, 3, 0, room.map, room));
		gameObjects.put(7, new TreeGameObject(26, 6, 0, 1, 31, 3, 0, room.map, room));
		gameObjects.put(8, new TreeGameObject(10, 26, 0, 1, 34, 3, 0, room.map, room));
		gameObjects.put(9, new TreeGameObject(13, 15, 0, 1, 39, 3, 0, room.map, room));
		gameObjects.put(10, new TreeGameObject(30, 7, 0, 1, 42, 3, 0, room.map, room));
		gameObjects.put(11, new TreeGameObject(15, 10, 0, 1, 48, 3, 0, room.map, room));
		gameObjects.put(12, new TreeGameObject(20, 4, 0, 1, 50, 3, 0, room.map, room));
		gameObjects.put(13, new TreeGameObject(45, 25, 0, 1, 56, 3, 0, room.map, room));
		gameObjects.put(14, new TreeGameObject(28, 47, 0, 1, 73, 3, 0, room.map, room));
		gameObjects.put(15, new MachineGameObject(26, 24, 0, 5, 0, 75, room.map, room));
		gameObjects.put(16, new TreeGameObject(5, 24, 0, 1, 76, 3, 0, room.map, room));
		gameObjects.put(17, new TreeGameObject(20, 8, 0, 1, 80, 3, 0, room.map, room));
		gameObjects.put(18, new TreeGameObject(15, 34, 0, 1, 92, 3, 0, room.map, room));
	}


}
