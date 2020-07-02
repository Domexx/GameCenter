
# ![Ares A](https://i.imgur.com/1zelxEp.png)  
  
[![Discord](https://img.shields.io/discord/683417203546128387?color=%237289DA&label=Discord)](https://discord.gg/pN7ZMFw)  
  
A GameCenter Plugin made for Arcturus Morningstar which includes SnowStorm & FastFood  
  
---  
  
## Table of Contents  
  
1. [Requirements](#1-requirements)
2. [Installation](#2-installation)  
3. [Credits](#3-credits)  
  
--- 
## 1. Requirements
- [OpenSourceSwf](https://git.krews.org/Dome/cleaned-up-swf-source)
- Arcturus 2.4.0
- Basic knowledge of adding stuff
- Patience & Coffee
	

## 2. Installation  

### SWF
- First of all download unzip the [assets.zip](https://git.krews.org/ares/gamecenter/uploads/1f57e1c085f7a111cbf3efa0be29a2b8/assets.zip) and move the files to your swf
- Add the code from the  **assets** *figuremap.xml*  into your **figuremap.xml**
- Place this code at the bottom of your **HabboAvatarActions.xml**
<!-- SnowWar -->
    <action  id="SnowWarRun" state="swrun" precedence="104" main="1" geometrytype="vertical" activepartset="snowwarrun" assetpartdefinition="swrun" prevents="fx.2,fx.3,fx.6,fx.14,fx.15,fx.17,fx.18,fx.19,fx.20,fx.21,fx.22,fx.33,fx.34,fx.35,fx.36,fx.38,fx.39,fx.45,fx.46,fx.48,fx.54,fx.55,fx.56,fx.57,fx.58,fx.69,fx.71,fx.72,fx.89,fx.90,fx.91,fx.92,fx.94,fx.97,fx.100,fx.104,fx.107,fx.108,fx.115,fx.116,fx.117,fx.118,fx.119,fx.120,fx.121,fx.122,fx.123,fx.124,fx.125,fx.127,fx.129,fx.130,fx.131,fx.132,fx.134,fx.135,fx.136,fx.137,fx.138,fx.139,fx.140,fx.141,fx.142,fx.143,fx.144,fx.145,fx.146,fx.147,fx.148,fx.149,fx.150,fx.151,fx.152,fx.153,fx.154,fx.155,fx.156,fx.157,dance"/>
    <action  id="SnowWarDieFront" state="swdiefront" precedence="105" main="1" geometrytype="swhorizontal" activepartset="snowwardiefront" assetpartdefinition="swdie" startfromframezero="true" prevents="fx.2,fx.3,fx.6,fx.14,fx.15,fx.17,fx.18,fx.19,fx.20,fx.21,fx.22,fx.33,fx.34,fx.35,fx.36,fx.38,fx.39,fx.45,fx.46,fx.48,fx.54,fx.55,fx.56,fx.57,fx.58,fx.69,fx.71,fx.72,fx.89,fx.90,fx.91,fx.92,fx.94,fx.97,fx.100,fx.104,fx.105,fx.107,fx.108,fx.115,fx.116,fx.117,fx.118,fx.119,fx.120,fx.121,fx.122,fx.123,fx.124,fx.125,fx.127,fx.129,fx.130,fx.131,fx.132,fx.134,fx.135,fx.136,fx.137,fx.138,fx.139,fx.140,fx.141,fx.142,fx.143,fx.144,fx.145,fx.146,fx.147,fx.148,fx.149,fx.150,fx.151,fx.152,fx.153,fx.154,fx.155,fx.156,fx.157,dance"/>
    <action  id="SnowWarDieBack" state="swdieback" precedence="106" main="1" geometrytype="swhorizontal" activepartset="snowwardieback" assetpartdefinition="swdie" startfromframezero="true" prevents="fx.2,fx.3,fx.6,fx.14,fx.15,fx.17,fx.18,fx.19,fx.20,fx.21,fx.22,fx.33,fx.34,fx.35,fx.36,fx.38,fx.39,fx.45,fx.46,fx.48,fx.54,fx.55,fx.56,fx.57,fx.58,fx.69,fx.71,fx.72,fx.89,fx.90,fx.91,fx.92,fx.94,fx.97,fx.100,fx.104,fx.105,fx.107,fx.108,fx.115,fx.116,fx.117,fx.118,fx.119,fx.120,fx.121,fx.122,fx.123,fx.124,fx.125,fx.127,fx.129,fx.130,fx.131,fx.132,fx.134,fx.135,fx.140,fx.141,fx.142,fx.143,fx.144,fx.145,fx.146,fx.147,fx.148,fx.149,fx.150,fx.151,fx.152,fx.153,fx.154,fx.155,fx.156,fx.157,dance"/>
    <action  id="SnowWarPick" state="swpick" precedence="107" main="1" geometrytype="vertical" activepartset="snowwarpick" assetpartdefinition="swpick" startfromframezero="true" prevents="fx.2,fx.3,fx.6,fx.14,fx.15,fx.17,fx.18,fx.19,fx.20,fx.21,fx.22,fx.33,fx.34,fx.35,fx.36,fx.38,fx.39,fx.45,fx.46,fx.48,fx.54,fx.55,fx.56,fx.57,fx.58,fx.69,fx.71,fx.72,fx.89,fx.90,fx.91,fx.92,fx.94,fx.97,fx.100,fx.104,fx.105,fx.107,fx.108,fx.115,fx.116,fx.117,fx.118,fx.119,fx.120,fx.121,fx.122,fx.123,fx.124,fx.125,fx.127,fx.129,fx.130,fx.131,fx.132,fx.134,fx.135,fx.136,fx.137,fx.138,fx.139,fx.140,fx.141,fx.142,fx.143,fx.144,fx.145,fx.146,fx.147,fx.148,fx.149,fx.150,fx.151,fx.152,fx.153,fx.154,fx.155,fx.156,fx.157,dance"/>
    <action  id="SnowWarThrow" state="swthrow" precedence="108" main="1" geometrytype="vertical" activepartset="snowwarthrow" assetpartdefinition="swthrow" startfromframezero="true" prevents="fx.2,fx.3,fx.6,fx.14,fx.15,fx.17,fx.18,fx.19,fx.20,fx.21,fx.22,fx.33,fx.34,fx.35,fx.36,fx.38,fx.39,fx.45,fx.46,fx.48,fx.54,fx.55,fx.56,fx.57,fx.58,fx.69,fx.71,fx.72,fx.89,fx.90,fx.91,fx.92,fx.94,fx.97,fx.100,fx.104,fx.105,fx.107,fx.108,fx.115,fx.116,fx.117,fx.118,fx.119,fx.120,fx.121,fx.122,fx.123,fx.124,fx.125,fx.127,fx.129,fx.130,fx.131,fx.132,fx.134,fx.135,fx.136,fx.137,fx.138,fx.139,fx.140,fx.141,fx.142,fx.143,fx.144,fx.145,fx.146,fx.147,fx.148,fx.149,fx.150,fx.151,fx.152,fx.153,fx.154,fx.155,fx.156,fx.157,dance"/>
   
   - If you use your own version of the OpenSourceSwf search into your **HabboMain.as** for
   `var _local_2:XML = <config>`
   
  Below this you'll see the  **<'asset-libraries'>** section
  replace the section with the following:
  

    			<asset-libraries>
					<library url="hh_human_face.swf"/>
					<library url="hh_human_body.swf"/>
					<library url="hh_human_hair.swf"/>
					<library url="hh_human_acc_chest.swf"/>
					<library url="hh_human_acc_eye.swf"/>
					<library url="hh_human_acc_face.swf"/>
					<library url="hh_human_acc_head.swf"/>
					<library url="hh_human_acc_waist.swf"/>
					<library url="hh_human_hats.swf"/>
					<library url="hh_human_item.swf"/>
					<library url="hh_human_leg.swf"/>
					<library url="hh_human_shirt.swf"/>
					<library url="hh_human_shoe.swf"/>
					<library url="hh_people_pool.swf"/>
					<library url="hh_human_fx.swf"/>
					<library url="hh_human_50_face.swf"/>
					<library url="hh_human_50_body.swf"/>
					<library url="hh_human_50_hair.swf"/>
					<library url="hh_human_50_acc_chest.swf"/>
					<library url="hh_human_50_acc_eye.swf"/>
					<library url="hh_human_50_acc_face.swf"/>
					<library url="hh_human_50_acc_head.swf"/>
					<library url="hh_human_50_acc_waist.swf"/>
					<library url="hh_human_50_hats.swf"/>
					<library url="hh_human_50_item.swf"/>
					<library url="hh_human_50_leg.swf"/>
					<library url="hh_human_50_shirt.swf"/>
					<library url="hh_human_50_shoe.swf"/>
					<library url="hh_human_50_fx.swf"/>
					<library url="hh_pets.swf"/>
					<library url="hh_pets_50.swf"/>
					<library url="hh_badges.swf"/>
				</asset-libraries>
### Configuration
- Now you download the pre-compiled [Plugin](https://git.krews.org/ares/gamecenter/uploads/fd4557930dda0bd928d4267232fb46ad/GameCenter-1.0.jar) if you didnt compile it by yourself
- Move the jar into your plugins folder & start your Emulator
- If you want to use FastFood get an API-Key from here [FastFoodGame](https://www.thefastfoodgame.com/) and place the key into your emulator_settings table

*NOTE: DON'T FORGET TO CHANGE YOUR EMULATOR_SETTINGS AFTER STARTING THE PLUGIN*

### Have fun
 p.s tHeRe ArE aLoT oF bUgS :)

## 3. Credits

**Contributor**
 - Dome#9999
 - necmi#5362

**Special thanks to**
 - Beny (*GameCenter & FastFood)*
 -  capostrike  (*For Snowstorm)*
 - SpreedBlood  (*Unknown*)
 - DIOCANE777 (*Ported Code from Comet to Arcturus*)
