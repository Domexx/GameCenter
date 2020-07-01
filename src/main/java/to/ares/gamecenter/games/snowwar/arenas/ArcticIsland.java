package to.ares.gamecenter.games.snowwar.arenas;

import com.eu.habbo.Emulator;
import to.ares.gamecenter.games.snowwar.Arena;
import to.ares.gamecenter.games.snowwar.GameFuseObject;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.items.BaseItem;
import to.ares.gamecenter.games.snowwar.items.MapStuffData;
import to.ares.gamecenter.games.snowwar.objects.GameItemObject;
import to.ares.gamecenter.games.snowwar.objects.MachineGameObject;
import to.ares.gamecenter.games.snowwar.objects.TreeGameObject;
import to.ares.gamecenter.games.snowwar.pathfinding.SpawnPoint;

import java.util.Map;

public class ArcticIsland extends Arena {
	public ArcticIsland() {
		GameFuseObject Item;

		ArenaType = 8;
		ArenaHeight = 50;
		ArenaWidth = 50;
		HeightMap = "" +
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

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 0;
		Item.X = 41;
		Item.Y = 37;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 1;
		Item.X = 2;
		Item.Y = 20;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 2;
		Item.X = 10;
		Item.Y = 18;
		Item.Rot = 6;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 3;
		Item.X = 19;
		Item.Y = 41;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 4;
		Item.X = 41;
		Item.Y = 20;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 5;
		Item.X = 9;
		Item.Y = 31;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 6;
		Item.X = 23;
		Item.Y = 44;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 7;
		Item.X = 4;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 8;
		Item.X = 2;
		Item.Y = 20;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 9;
		Item.X = 25;
		Item.Y = 38;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 10;
		Item.X = 2;
		Item.Y = 19;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 11;
		Item.X = 9;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 12;
		Item.X = 7;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 2
		Item.baseItem = BaseItem.snst_fence;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 13;
		Item.X = 17;
		Item.Y = 14;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("2");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 14;
		Item.X = 2;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 15;
		Item.X = 49;
		Item.Y = 28;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 16;
		Item.X = 2;
		Item.Y = 22;
		Item.Rot = 6;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 17;
		Item.X = 5;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 18;
		Item.X = 4;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 19;
		Item.X = 39;
		Item.Y = 22;
		Item.Rot = 2;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 20;
		Item.X = 39;
		Item.Y = 23;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 2
		Item.baseItem = BaseItem.snst_fence;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 21;
		Item.X = 24;
		Item.Y = 44;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 22;
		Item.X = 36;
		Item.Y = 15;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 23;
		Item.X = 23;
		Item.Y = 44;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 24;
		Item.X = 47;
		Item.Y = 32;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 25;
		Item.X = 39;
		Item.Y = 37;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 26;
		Item.X = 8;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 27;
		Item.X = 2;
		Item.Y = 19;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 28;
		Item.X = 6;
		Item.Y = 20;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 29;
		Item.X = 2;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 2
		Item.baseItem = BaseItem.snst_fence;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 30;
		Item.X = 15;
		Item.Y = 14;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 31;
		Item.X = 26;
		Item.Y = 6;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 32;
		Item.X = 39;
		Item.Y = 23;
		Item.Rot = 4;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 33;
		Item.X = 23;
		Item.Y = 38;
		Item.Rot = 2;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 34;
		Item.X = 10;
		Item.Y = 26;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 35;
		Item.X = 23;
		Item.Y = 45;
		Item.Rot = 4;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 36;
		Item.X = 39;
		Item.Y = 21;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 37;
		Item.X = 5;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 38;
		Item.X = 39;
		Item.Y = 24;
		Item.Rot = 6;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 39;
		Item.X = 13;
		Item.Y = 15;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 40;
		Item.X = 3;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 2
		Item.baseItem = BaseItem.snst_fence;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 41;
		Item.X = 13;
		Item.Y = 14;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("1");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 42;
		Item.X = 30;
		Item.Y = 7;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 43;
		Item.X = 40;
		Item.Y = 20;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 2
		Item.baseItem = BaseItem.snst_fence;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 44;
		Item.X = 29;
		Item.Y = 7;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("1");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 2
		Item.baseItem = BaseItem.snst_fence;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 45;
		Item.X = 21;
		Item.Y = 14;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("2");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 2
		Item.baseItem = BaseItem.snst_fence;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 46;
		Item.X = 24;
		Item.Y = 40;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 47;
		Item.X = 23;
		Item.Y = 40;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 48;
		Item.X = 15;
		Item.Y = 10;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 49;
		Item.X = 37;
		Item.Y = 37;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 50;
		Item.X = 20;
		Item.Y = 4;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 51;
		Item.X = 3;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 52;
		Item.X = 23;
		Item.Y = 40;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 53;
		Item.X = 2;
		Item.Y = 22;
		Item.Rot = 2;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 54;
		Item.X = 43;
		Item.Y = 20;
		Item.Rot = 6;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 55;
		Item.X = 23;
		Item.Y = 39;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 56;
		Item.X = 45;
		Item.Y = 25;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 57;
		Item.X = 23;
		Item.Y = 42;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 58;
		Item.X = 42;
		Item.Y = 20;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 59;
		Item.X = 9;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 60;
		Item.X = 10;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 2
		Item.baseItem = BaseItem.snst_fence;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 61;
		Item.X = 24;
		Item.Y = 38;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("1");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 62;
		Item.X = 11;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 63;
		Item.X = 39;
		Item.Y = 37;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 64;
		Item.X = 8;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 65;
		Item.X = 39;
		Item.Y = 20;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 66;
		Item.X = 38;
		Item.Y = 37;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 67;
		Item.X = 40;
		Item.Y = 37;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 68;
		Item.X = 2;
		Item.Y = 21;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 2
		Item.baseItem = BaseItem.snst_fence;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 69;
		Item.X = 24;
		Item.Y = 42;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("2");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 70;
		Item.X = 39;
		Item.Y = 22;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 71;
		Item.X = 38;
		Item.Y = 37;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 72;
		Item.X = 40;
		Item.Y = 20;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 73;
		Item.X = 28;
		Item.Y = 47;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 74;
		Item.X = 6;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.s_snowball_machine;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 75;
		Item.X = 26;
		Item.Y = 24;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 76;
		Item.X = 5;
		Item.Y = 24;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 77;
		Item.X = 41;
		Item.Y = 20;
		Item.Rot = 4;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 2
		Item.baseItem = BaseItem.snst_fence;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 78;
		Item.X = 19;
		Item.Y = 14;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.ads_background;
		Item.baseItem.allowWalk = true;
		Item.baseItem.Height = 0.0f;
		Item.baseItem.itemExtraType = MapStuffData.TYPE_ID;
		Item.itemId = 79;
		Item.X = 0;
		Item.Y = 19;
		Item.Rot = 1;
		Item.Z = 0;
		Item.extraData = new MapStuffData("state=0\toffsetX=-1166\toffsetZ=10000\toffsetY=1542\timageUrl=" + Emulator.getConfig().getValue("gamecenter.snowwar.artic.bg"));
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 80;
		Item.X = 20;
		Item.Y = 8;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 81;
		Item.X = 2;
		Item.Y = 21;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 82;
		Item.X = 23;
		Item.Y = 38;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 83;
		Item.X = 23;
		Item.Y = 42;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 84;
		Item.X = 42;
		Item.Y = 20;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 85;
		Item.X = 39;
		Item.Y = 21;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 86;
		Item.X = 12;
		Item.Y = 18;
		Item.Rot = 4;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 87;
		Item.X = 11;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 88;
		Item.X = 40;
		Item.Y = 37;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 89;
		Item.X = 23;
		Item.Y = 41;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 90;
		Item.X = 43;
		Item.Y = 20;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 91;
		Item.X = 39;
		Item.Y = 20;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 92;
		Item.X = 15;
		Item.Y = 34;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 93;
		Item.X = 6;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 94;
		Item.X = 7;
		Item.Y = 18;
		Item.Rot = 0;
		Item.Z = 1440;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 2
		Item.baseItem = BaseItem.snst_fence;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 95;
		Item.X = 29;
		Item.Y = 9;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("2");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 96;
		Item.X = 39;
		Item.Y = 24;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 97;
		Item.X = 23;
		Item.Y = 43;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);


		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.ads_igorraygun;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.1f;
		Item.itemId = 98;
		Item.X = 28;
		Item.Y = 12;
		Item.Rot = 4;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.ads_igorraygun;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.1f;
		Item.itemId = 99;
		Item.X = 41;
		Item.Y = 33;
		Item.Rot = 6;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.ads_igorraygun;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.1f;
		Item.itemId = 100;
		Item.X = 31;
		Item.Y = 41;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.ads_igorraygun;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.1f;
		Item.itemId = 101;
		Item.X = 17;
		Item.Y = 37;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.ads_igorraygun;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.1f;
		Item.itemId = 102;
		Item.X = 11;
		Item.Y = 21;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);


		spawnsBLUE.add(new SpawnPoint(22,9));
		spawnsBLUE.add(new SpawnPoint(25,12));
		spawnsBLUE.add(new SpawnPoint(26,8));
		spawnsBLUE.add(new SpawnPoint(31,14));
		spawnsBLUE.add(new SpawnPoint(23,13));

		spawnsRED.add(new SpawnPoint(30,43));
		spawnsRED.add(new SpawnPoint(33,42));
		spawnsRED.add(new SpawnPoint(38,41));
		spawnsRED.add(new SpawnPoint(26,42));
		spawnsRED.add(new SpawnPoint(33,46));
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
