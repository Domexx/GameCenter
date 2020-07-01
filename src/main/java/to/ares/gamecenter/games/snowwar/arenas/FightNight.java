package to.ares.gamecenter.games.snowwar.arenas;

import com.eu.habbo.Emulator;
import to.ares.gamecenter.games.snowwar.Arena;
import to.ares.gamecenter.games.snowwar.GameFuseObject;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.items.BaseItem;
import to.ares.gamecenter.games.snowwar.items.MapStuffData;
import to.ares.gamecenter.games.snowwar.objects.GameItemObject;
import to.ares.gamecenter.games.snowwar.objects.PileGameObject;
import to.ares.gamecenter.games.snowwar.objects.TreeGameObject;
import to.ares.gamecenter.games.snowwar.pathfinding.SpawnPoint;

import java.util.Map;

public class FightNight extends Arena {
	public FightNight() {
		GameFuseObject Item;

		ArenaType = 11;
		ArenaWidth = 50;
		ArenaHeight = 50;
		HeightMap = "" +
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

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 0;
		Item.X = 29;
		Item.Y = 23;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 1;
		Item.X = 11;
		Item.Y = 16;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 2;
		Item.X = 26;
		Item.Y = 28;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 3;
		Item.X = 31;
		Item.Y = 42;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk = true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 4;
		Item.X = 27;
		Item.Y = 16;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 5;
		Item.X = 32;
		Item.Y = 10;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("1");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 6;
		Item.X = 13;
		Item.Y = 21;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 7;
		Item.X = 33;
		Item.Y = 14;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk = true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 8;
		Item.X = 18;
		Item.Y = 14;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 9;
		Item.X = 15;
		Item.Y = 36;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("1");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 10;
		Item.X = 34;
		Item.Y = 17;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("2");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 11;
		Item.X = 17;
		Item.Y = 33;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("2");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 12;
		Item.X = 27;
		Item.Y = 17;
		Item.Rot = 4;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk = true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 13;
		Item.X = 31;
		Item.Y = 12;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 14;
		Item.X = 34;
		Item.Y = 42;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("2");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 15;
		Item.X = 41;
		Item.Y = 31;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 16;
		Item.X = 9;
		Item.Y = 20;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 17;
		Item.X = 30;
		Item.Y = 39;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("1");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 18;
		Item.X = 21;
		Item.Y = 27;
		Item.Rot = 6;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk = true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 19;
		Item.X = 27;
		Item.Y = 12;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 20;
		Item.X = 22;
		Item.Y = 28;
		Item.Rot = 4;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 21;
		Item.X = 13;
		Item.Y = 31;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 22;
		Item.X = 10;
		Item.Y = 30;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk = true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 23;
		Item.X = 22;
		Item.Y = 35;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk = true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 24;
		Item.X = 21;
		Item.Y = 28;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.xm09_man_a;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 25;
		Item.X = 14;
		Item.Y = 9;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 26;
		Item.X = 40;
		Item.Y = 34;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("1");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 27;
		Item.X = 42;
		Item.Y = 21;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk = true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 28;
		Item.X = 27;
		Item.Y = 32;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 29;
		Item.X = 25;
		Item.Y = 20;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("2");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 30;
		Item.X = 36;
		Item.Y = 14;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 31;
		Item.X = 11;
		Item.Y = 26;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 32;
		Item.X = 39;
		Item.Y = 36;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("1");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 33;
		Item.X = 25;
		Item.Y = 24;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk = true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 34;
		Item.X = 22;
		Item.Y = 13;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 35;
		Item.X = 13;
		Item.Y = 13;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 2
		Item.baseItem = BaseItem.snst_fence;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 36;
		Item.X = 19;
		Item.Y = 22;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 37;
		Item.X = 28;
		Item.Y = 9;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("1");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 2
		Item.baseItem = BaseItem.snst_fence;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 38;
		Item.X = 34;
		Item.Y = 26;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("1");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 39;
		Item.X = 19;
		Item.Y = 11;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("1");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk = true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 40;
		Item.X = 32;
		Item.Y = 20;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 41;
		Item.X = 29;
		Item.Y = 44;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 42;
		Item.X = 43;
		Item.Y = 27;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 43;
		Item.X = 19;
		Item.Y = 36;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 44;
		Item.X = 29;
		Item.Y = 26;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("1");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.xm09_man_c;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 45;
		Item.X = 14;
		Item.Y = 9;
		Item.Rot = 4;
		Item.Z = 2480;
		Item.extraData.setExtraData("6");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.ads_background;
		Item.baseItem.allowWalk = true;
		Item.baseItem.Height = 0.0f;
		Item.baseItem.itemExtraType = MapStuffData.TYPE_ID;
		Item.itemId = 46;
		Item.X = 0;
		Item.Y = 22;
		Item.Rot = 1;
		Item.Z = 0;
		Item.extraData = new MapStuffData("state=0\toffsetX=-1119\toffsetZ=9950\toffsetY=390\timageUrl=" + Emulator.getConfig().getValue("gamecenter.snowwar.fightnight.bg"));
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 47;
		Item.X = 14;
		Item.Y = 17;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 48;
		Item.X = 24;
		Item.Y = 9;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 49;
		Item.X = 22;
		Item.Y = 20;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 2
		Item.baseItem = BaseItem.snst_fence;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 50;
		Item.X = 17;
		Item.Y = 22;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("1");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 51;
		Item.X = 26;
		Item.Y = 16;
		Item.Rot = 6;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk = true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 52;
		Item.X = 17;
		Item.Y = 29;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 53;
		Item.X = 22;
		Item.Y = 27;
		Item.Rot = 6;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 54;
		Item.X = 37;
		Item.Y = 40;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 55;
		Item.X = 24;
		Item.Y = 42;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 56;
		Item.X = 17;
		Item.Y = 10;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk = true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 57;
		Item.X = 14;
		Item.Y = 24;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 58;
		Item.X = 20;
		Item.Y = 40;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 59;
		Item.X = 20;
		Item.Y = 8;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_ballpile;
		Item.baseItem.allowWalk = true;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 60;
		Item.X = 17;
		Item.Y = 35;
		Item.Rot = 0;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_block1;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 61;
		Item.X = 26;
		Item.Y = 17;
		Item.Rot = 4;
		Item.Z = 0;
		Item.extraData.setExtraData("");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.snst_tree1_d;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 1.0f;
		Item.itemId = 62;
		Item.X = 22;
		Item.Y = 24;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("0");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 2
		Item.baseItem = BaseItem.snst_fence;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 63;
		Item.X = 30;
		Item.Y = 26;
		Item.Rot = 2;
		Item.Z = 0;
		Item.extraData.setExtraData("1");
		fuseObjects.add(Item);

		Item = new GameFuseObject();// 1
		Item.baseItem = BaseItem.xm09_man_b;
		Item.baseItem.allowWalk = false;
		Item.baseItem.Height = 0.0f;
		Item.itemId = 64;
		Item.X = 14;
		Item.Y = 9;
		Item.Rot = 4;
		Item.Z = 1280;
		Item.extraData.setExtraData("5");
		fuseObjects.add(Item);

		spawnsBLUE.add(new SpawnPoint(10,10));
		spawnsRED.add(new SpawnPoint(11,11));
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
