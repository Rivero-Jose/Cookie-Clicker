
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


class Clicker {
		
	public String in(String s){
		return JOptionPane.showInputDialog(s);
	}
	public void msg(String s){
		JOptionPane.showMessageDialog(null, s);
		
	}
	Sound S = new Sound();
	double numcook = 0;
	double addcook = 1;
	double costofclick = 75;
	double totalcook = 0;
	double totalupgrades = 0;
	double numclick = 0;
	double numcursor = 0;
	double costofcursor = 10;
	Random gene = new Random();
	double coststeal = 1000000;
	int kk = 0;
	
	
	double costbank = 100000;
	double costearth = 1000000;
	boolean xxx = false;
	boolean yyx = false;
	public void store(){
		String [] buttons = {"A) Buy upgrade Cost is " + costofclick,"B) Buy upgrade Cost is " + costofcursor ,"C) Buy Upgrade Cost is " + coststeal,"D) Buy Upgrade Cost is " + costbank,"E) Buy Upgrade Cost is " + costearth,"Back"};
		int x = JOptionPane.showOptionDialog(null, "Num of cookies " + numcook + "\n A)Times 2, to current cookies per click \n B)Adds 1, to current cookies per click \n C)Buy upgrade to disable Cookie Thiefs and Cookie Monsters \n D)Buy upgrade to unlock the cookie bank \n E)Buy upgrade to unlock the cookie earth", s + "'s Bakery", 0, JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons);
	totalcook *= 1000000000;
		if(x == 0){
			if(numcook >= costofclick){
				numcook -= costofclick;
				addcook *= 2;
				costofclick *= 2;
				numclick++;
				totalupgrades++;
				msg("Thank you for you cookie purchase");
				store();
			}else{
				msg("Not enough cookies");
				store();
			}
		}else if(x == 1){
			if(numcook >= costofcursor){
				numcook -= costofcursor;
				addcook += 1;
				costofcursor *= 2;
				numcursor++;
				totalupgrades++;
				msg("Thank you for your cookie purchase");
				store();
			}else{
				msg("Not enough cookies");
				store();
			}
		}else if(x == 2){
			if(kk == 0){
				if(numcook >= coststeal){
					numcook -= coststeal;
					totalupgrades++;
					kk = 1;
					msg("Thank you for your cookie purchase");
					store();
				}else{
					msg("Not enough cookies");
					store();
				}
			}else{
				msg("You already bought this");
				store();
			}
		}else if(x == 3){
			if(xxx == false){
				if(numcook >= costbank){
					numcook -= costbank;
					totalupgrades++;
					xxx = true;
					msg("Thank you for purchasing the cookie bank");
					store();
				}else{
					msg("Not enough cookies");
					store();
				}
			}else{
				msg("You already bought this");
				store();
			}
		}else if(x == 4){
			if(yyx == false){
				if(numcook >= costearth){
					numcook -= costearth;
					totalupgrades++;
					yyx = true;
					msg("Thank you for purchasing the cookie earth");
					store();
				}else{
					msg("Not enough cookies");
					store();
				}
			}else{
				msg("You already bought this");
				store();
			}
		}else if(x == 5){
			cookie();
		}
	}
	
	
	int i = 0;
	int jj = 0;
	int jjj = 0;
	int jjjj = 0;
	String s = "";
	int gc = 0;
	public void cookie(){
		while(i == 0){
		name();
		i = 1;
		}
		int z = gene.nextInt(500000)+ 1;
		int zz = gene.nextInt(1000) + 1;
		int zzz = gene.nextInt(100) + 1;
		int zzzz = gene.nextInt(200) + 1;
		if(z == 1){
			jj = 1;
		}
		if(kk == 0){
			if(zz == 1){
			if(numcook >= 1000){
				numcook -= 1000;
			msg("Cookie Monster came and ate 1000 cookies \n" +
					"Cookie Monster's chance of appearing is 1 in 1000");
			
			jjj = 1;
			}
			}
		}if(kk == 0){
			if(zzz == 1){
			if(numcook >= 100){
				numcook -= 100;
			msg("A Cookie Thief came and took 100 cookies \n" +
					"A Thief's chance of appearing is 1 in 100");
			
			jjjj = 1;
			}
		}
			if(zzzz == 1){
				gc++;
				numcook += 10000;
				msg("You got a Golden Cookie! \n" +
						"You just got 10000 Cookies!!! \n" +
						"This is a 1 in 200 chance");
			}
		}
		ImageIcon picture = new ImageIcon(Clicker.class.getResource("COOKIE.png"));
		ImageIcon picture1 = new ImageIcon(Clicker.class.getResource("STORE.png"));
		ImageIcon picture2= new ImageIcon(Clicker.class.getResource("TROPHY.png"));
		ImageIcon picture3 = new ImageIcon(Clicker.class.getResource("NAME.png"));
		ImageIcon picture4 = new ImageIcon(Clicker.class.getResource("MUSIC.png"));
		ImageIcon picture5 = new ImageIcon(Clicker.class.getResource("BANK.png"));
		ImageIcon picture6 = new ImageIcon(Clicker.class.getResource("EARTH.png"));
		ImageIcon picture7 = new ImageIcon(Clicker.class.getResource("HELP.png"));
		ImageIcon picture8 = new ImageIcon(Clicker.class.getResource("QUIT.png"));
//		String [] buttons = {"Store", "Achievements","Rename yourself","Play music", "Quit"};
//		int x = JOptionPane.showOptionDialog(null,  s +"'s Bakery \n Num of cookies " + numcook, s + "'s Bakery", 0, JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons);
		
		ImageIcon [] buttons1 = {picture , picture1 , picture2 , picture3 , picture4 , picture5, picture6, picture7, picture8};
		int y = JOptionPane.showOptionDialog(null,  s +"'s Bakery \n Number of cookies " + numcook + "\n Cookies per click " + addcook, s + "'s Bakery", 0, JOptionPane.INFORMATION_MESSAGE, null, buttons1, buttons1);
	if (y == 0){
		addbank();
		addearth();
		totalcook += addcook;
		numcook += addcook;
		cookie();		
	}else if (y == 1){
		store();
	}else if (y == 2){
		achievements();
	}else if(y == 3){
		name();
	}else if(y == 4){
		play();
	}else if(y == 5){
		if(xxx == true){
		bank();
		}else{
			msg("Purchase the cookie bank upgrade from the store");
			cookie();
		}
	}else if(y == 6){
		if(yyx == true){
			earth();
		}else{
			msg("Purchase the cookie earth upgrade from the store");
			cookie();
		}
	}else if(y == 7){
		help();
		cookie();
	}else if(y == 8){
		quit();
	}
	}
	
	public void achievements(){
		String a = "locked";
		String b = "locked";
		String c = "locked";
		String d = "locked";
		String e = "locked";
		String f = "locked";
		String g = "locked";
		String h = "locked";
		String i = "locked";
		String j = "locked";
		String k = "locked";
		String l = "locked";
		String m = "locked";
		String n = "locked";
		String o = "locked";
		String p = "locked";
		String q = "locked";
		String r = "locked";
		String t = "locked";
		String u = "locked";
		String v = "locked";
		String w = "locked";
		String y = "locked";
		String yy = "locked";
		String yyy = "locked";
		String yyyy = "locked";
		
		String zzz = "What's in a name. You named your bakery";
		String zz = "locked";
		String zz1 = "locked";
		String zz2 = "locked";
		String zz3 = "locked";
		String zz4 = "locked";
		String zz5 = "locked";
		String zz6 = "locked";
		String zz7 = "locked";
		String zz8 = "locked";
		String zz9 = "locked";
		String zz10 = "locked";
		
		String a1 = "locked";
		String a2 = "locked";
		String a3 = "locked";
		String a4 = "locked";
		String a5 = "locked";
		String a6 = "locked";
		String a7 = "locked";
		String a8 = "locked";
		String a9 = "locked";
		String a10 = "locked";
		String b1 = "locked";
		String b2 = "locked";
		String b3 = "locked";
		String b4 = "locked";
		String b5 = "locked";
		String b6 = "locked";
		String b7 = "locked";
		String b8 = "locked";
		String b9 = "locked";
		String b10 = "locked";
		String c1 = "locked";
		String c2 = "locked";
		String c3 = "locked";
		String c4 = "locked";
		String c5 = "locked";
		String c6 = "locked";
		String c7 = "locked";
		String c8 = "locked";
		String c9 = "locked";
		String c10 = "locked";
		String c11 = "locked";
		String d1 = "locked";
		String d2 = "locked";
		String d3 = "locked";
		String d4 = "locked";
		String d5 = "locked";
		String d6 = "locked";
		
		String m1 = "locked";
		String m2 = "locked";
		String m3 = "locked";
		String m4 = "locked";
		String m5 = "locked";
		String m6 = "locked";
		String m7 = "locked";
		String m8 = "locked";
		String m9 = "locked";
		String m10 = "locked";
		
		String g1 = "locked";
		String g2 = "locked";
		String g3 = "locked";
		String g4 = "locked";
		String g5 = "locked";
		String g6 = "locked";
		String g7 = "locked";
		String g8 = "locked";
		String g9 = "locked";
		String g10 = "locked";
		String g11 = "locked";
		String g12 = "locked";
		String g13 = "locked";
		String g14 = "locked";
		String g15 = "locked";
		String g16 = "locked";
		String g17 = "locked";
		String g18 = "locked";
		String g19 = "locked";
		String g20 = "locked";
		String g21 = "locked";
		String g22 = "locked";
		String g23 = "locked";
		String g24 = "locked";
		String g25 = "locked";
		String g26 = "locked";
		String g27 = "locked";
		String g28 = "locked";
		String g29 = "locked";
		String g30 = "locked";
		String g31 = "locked";
		String g32 = "locked";
		
		String f1 = "locked";
		String f2 = "locked";
		String f3 = "locked";
		String f4 = "locked";
		String f5 = "locked";
		String f6 = "locked";
		String f7 = "locked";
		String f8 = "locked";
		String f9 = "locked";
		String f10 = "locked";
		String f11 = "locked";
		String f12 = "locked";
		String f13 = "locked";
		String f14 = "locked";
		String h1 = "locked";
		String h2 = "locked";
		String h3 = "locked";
		String h4 = "locked";
		String h5 = "locked";
		String h6 = "locked";
		String h7 = "locked";
		String h8 = "locked";
		String h9 = "locked";
		String h10 = "locked";
		String h11 = "locked";
		String h12 = "locked";
		String h13 = "locked";
		
	if(xxx == true){
		h13 = "Trustworthy funds. You purchased the cookie bank upgrade";
	}if(yyx == true){
		g32 = "The world is all for the cookies. You purchased the cookie earth upgrade";
	}
	if(totalcook >= 1){
		a = "Wake and bake. You have baked 1 cookie all time";
	}if(totalcook >= 10){
		b = "Making some dough. You have baked 10 cookies all time";
	}if(totalcook >= 100){
		c = "So baked right now. You have baked 100 cookies all time";
	}if(totalcook >= 1000){
		d = "Fledging bakery. You have baked 1000 cookies all time";
	}if(totalcook >= 10000){
		e = "Affluent bakery. You have baked 10000 cookies all time";
	}if(totalcook >= 100000){
		f = "World famous bakery. You have baked 100000 cookies all time";
	}if(totalcook >= 1000000){
		g = "Cosmic bakery. You have baked 1000000 cookies all time";
	}if(totalcook >= 10000000){
		h = "Galactic bakery. You have baked 10000000 cookies all time";
	}if(totalcook >= 100000000){
		i = "Universal bakery. You have baked 100000000 cookies all time";
	}if(totalcook >= 1000000000){
		j = "Don't stop me now. You have baked 1000000000 cookies all time";
	}if(totalcook >= 2147483647){
		k = "Java bakery. You have baked 2147483647 cookies all time. The maximium number in Java Integers";
	}if(totalcook >= 10000000000.0){
		l = "Timeless Bakery. You have baked 10000000000 cookies all time";
	}if(totalcook >= 100000000000.0){
		m = "Infinite Bakery. You have baked 100000000000 cookies all time";
	}if(totalcook >= 1000000000000.0){
		n = "Immortal Bakery. You have baked 1000000000000 cookies all time";
	}if(totalcook >= 10000000000000.0){
		o = "You can stop now. You have baked 10000000000000 cookies all time";
	}if(totalcook >= 100000000000000.0){
		p = "Cookies all the way down. You have baked 100000000000000 cookies all time";
	}if(totalcook >= 100000000000000.0){
		q = "Overdose. You have baked 1000000000000000 cookies all time";
	}if(totalcook >= 1000000000000000.0){
		r = "How? You have baked 10000000000000000 cookies all time";
	}if(totalcook >= 1000000000000000000.0){
		t = "The land of milk and cookies. You have baked 1000000000000000000 cookies all time";
	}if(totalcook >= 10000000000000000000.0){
		u = "He who controls the cookies, controls the universe. You have baked 10000000000000000000 cookies all time";
	}if(totalcook >= 100000000000000000000.0){
		v = "Tonight on hoaders. You have baked 100000000000000000000 cookies all time";
	}if(totalcook >= 1000000000000000000000.0){
		w = "Are you gonna eat all that? You have baked 1000000000000000000000 cookies all time";
	}if(totalcook >= 1000000000000000000000.0){
		y = "We're gonna need a bigger bakery. You have baked 10000000000000000000000 cookies all time";
	}if(totalcook >= 1000000000000000000000.0){
		yy = "In the mouth of madness. You have baked 100000000000000000000000 cookies all time";
	}if(totalcook >= 1000000000000000000000.0){
		yyy = "Brought to you by the letter cookie. You have baked 1000000000000000000000000 cookies all time";
	}if(totalcook >= 10000000000000000000000.0){
		yyyy = "COOKIE MONSTER. You have baked 1000000000000000000000000 cookies all time";
	}
	
	if(z == 1){
		zz = "The creator. You named yourself as the creator of this game";
	}if(z1 == 1){
		zz1 = "Huh? Is it you? You named yourself either Casey, Christina, Jen, Lucia, Julie, or Jorge";
	}if(z2 == 1){
		zz2 = "I don't think your God... You named yourself God";
	}if(z3 == 1){
		zz3 = "It's Rico!, 'take out a sheet of paper!' You named yourself Rico";
	}if(z4 == 1){
		zz4 = "Do you like cookies too? You named yourself Cookie";
	}if(z5 == 1){
		zz5 = "No name needed. You have no name";
	}if(z6 == 1){
		zz6 = "Um null? You named yourself null?";
	}if(z7 == 1){
		zz7 = "UMIDAHHHHHHHHHHHHHHHH!!! You named yourself Umi; Didn't see that coming";
	}if(z8 == 1){
		zz8 = "Only the best. You named yourself Ethan";
	}if(z9 == 1){
		zz9 = "NOTICE ME SENPAI! You named yourself Senpai";
	}if(z10 == 1){
		zz10 = "COOKIE MONSTER! You named yourself Cookie Monster";
	}
	
	if(totalupgrades >= 1){
		a1 = "Just one. You have 1 upgrade";
	}if(totalupgrades >= 3){
		a2 = "3's a crowd. You have 3 upgrades";
	}if(totalupgrades >= 25){
		a3 = "Enhancer. You have 25 upgrades";
	}if(totalupgrades >= 70){
		a4 = "Augmenter. You have 70 upgrades";
	}if(totalupgrades >= 125){
		a5 = "Upgrader. You have 125 upgrades";
	}if(totalupgrades >= 250){
		a6 = "Lord of progress. You have 200 upgrades";
	}if(totalupgrades >= 400){
		a7 = "Polymath. You have 400 upgrades";
	}if(totalupgrades >= 777){
		a8 = "The elder scrolls. You have 777 upgrades";
	}if(totalupgrades >= 2000){
		a9 = "Engineer You have 2000 upgrades";
	}if(totalupgrades >= 3000){
		a10 = "Lord of Constructs. You have 3000 upgrades";
	}
	if(numclick >= 1){
		b1 = "Just Juan. You have 1 upgrade of times 2";
	}if(numclick >= 5){
		b2 = "Choose ur Lv 5 starter... . You have 5 upgrades of times 2";
	}if(numclick >= 20){
		b3 = "Do you like math? You have 20 upgrades of times 2";
	}if(numclick >= 50){
		b4 = "I warn you.... You have 50 upgrades of times 2";
	}if(numclick >= 100){
		b5 = "Pikachu is LV 100! oh... wrong game . You have 100 upgrades of times 2";
	}if(numclick >= 200){
		b6 = "2 many. You have 200 upgrades of times 2";
	}if(numclick >= 300){
		b7 = "300 2 many. You have 300 upgrades of times 2";
	}if(numclick >= 777){
		b8 = "A lucky cookie. You have 777 upgrades of times 2";
	}if(numclick >= 1000){
		b9 = "Numbers are just Numbers. You have 1000 upgrades of times 2";
	}if(numclick >= 1500){
		b10 = "There are more important things... like clicking the cookie. You have 1500 upgrades of times 2";
	}
	if(numcursor >= 1){
		c1 = "Add 1. You have 1 upgrade of +1";
	}if(numcursor >= 3){
		c2 = "Add 3. You have 3 upgrades of +1";
	}if(numcursor >= 20){
		c3 = "Add 20. You have 20 upgrades of +1";
	}if(numcursor >= 50){
		c4 = "Add 50. You have 50 upgrades of +1";
	}if(numcursor >= 100){
		c5 = "100? Wow. You have 100 upgrades of +1";
	}if(numcursor >= 200){
		c6 = "200!?. You have 200 upgrades of +1";
	}if(numcursor >= 300){
		c7 = "Add 100 + 200. You have 300 upgrades of +1";
	}if(numcursor >= 777){
		c8 = "Lucky 7 You have 777 upgrades of +1";
	}if(numcursor >= 1000){
		c9 = "Just too many. You have 1000 upgrades of +1";
	}if(numcursor >= 9000) {
		c10 = "OVER 9000!!!. You have 9000 upgrades of +1";
	}if(kk == 1){
		c11 = "Statecookies here, Statecookies replace. You brought the Upgrade to turn off Thiefs";
	}
	
	if(jj == 1){
		d1 = "Just Plain Lucky. You have a 1 in 500000 every time you click COOKIE";
	}if(jjjj == 1){
		d2 = "NOOO MY COOKIES!. A cookie thief took your cookies";
	}if(jjj == 1){
		d3 = "*Gasp* ITS COOKIE MONSTER. Cookies monster ate you cookies";
	}if(mm1 == 1){
		m1 = "Its a Cookie Dream Fever here. You played the song 2D Dream Fever";
	}if(mm2 == 1){
		m2 = "Its a Tokyo Cookie Bear! You played the song Tokyo Teddy Bear";
	}if(mm3 == 1){
		m3 = "Cookiemon! You played the Pokemon theme song";
	}if(mm4 == 1){
		m4 = "Its just like a Cookiework! BOOM BOOM BOOM! You played the song Firework";
	}if(mm5 == 1){
		m5 = "Only MY Cookie. You played the song Only My Railgun";
	}if(mm6 == 1){
		m6 = "Magnetic Cookies. You played the song Magnetic Today";
	}if(mm7 == 1){
		m7 = "Cookie Party. You played the song Slumber Party";
	}if(mm8 == 1){
		m8 = "Do you mind? I'm baking cookies. You played the song Do you mind";
	}if(mm9 == 1){
		m9 = "Cookie Warriors. You played the song Day Dream Warriors";
	}if(mm10 == 1){
		m10 = "Oh! You must like the cookie clicker song from the start You played the song! You played the Cookie Clicker song";
	}
	
	
	if(e1 == false){
		g1 = "Just rich. You bought Qatar";
	}if(e2 == false){
		g2 = "Luxrious. You bought Luxembourg";
	}if(e3 == false){
		g3 = "Sing-a-cookie. You bought Singapore";
	}if(e4 == false){
		g4 = "There's no-r-way out of this now. You bought Norway";
	}if(e5 == false){
		g5 = "King Kong vs Cookie Kong. You bought Hong Kong";
	}if(e6 == false){
		g6 = "'MERICA. You bought U.S.A.";
	}if(e7 == false){
		g7 = "Pass the Switz cheese... i mean Switz cookie. You bought Switzerland";
	}if(e8 == false){
		g8 = "Salty Cookies. You bought Saudi Arabia";
	}if(e9 == false){
		g9 = "You will never land here. You bought the Netherlands";
	}if(e10 == false){
		g10 = "Chug down your cookies friends. You bought Ireland";
	}if(e11 == false){
		g11 = "Poisonous cookies. You bought Australia";
	}if(e12 == false){
		g12 = "Hung-(a)-ry Cookies. You bought Austria";
	}if(e13 == false){
		g13 = "Make the cookies your self, theres an instruction manuel You bought Sweden";
	}if(e14 == false){
		g14 = "War hungry for cookies. You bought Germany";
	}if(e15 == false){
		g15 = "Tai wants wan cookies. You bought Taiwan";
	}if(e16 == false){
		g16 = "Mmmh Maple cookies. You bought Canada";
	}if(e17 == false){
		g17 = "I declare this mark for the cookie of the den. You bought Denmark";
	}if(e18 == false){
		g18 = "Just too cold for cookies. You bought Iceland";
	}if(e19 == false){
		g19 = "Belgium Waffle cookies. You bought Belgium";
	}if(e20 == false){
		g20 = "Macaron Macaron Macaron no~. You bought France";
	}if(e21 == false){
		g21 = "Cookies grew fins on land. You bought Finland";
	}if(e22 == false){
		g22 = "U Okay? . You bought U.K.";
	}if(e23 == false){
		g23 = "Home of the rising cookie. You bought Japan";
	}if(e24 == false){
		g24 = "North or South?. You bought Korea";
	}if(e25 == false){
		g25 = "Create a Zealand Obj from the Zealand class. You bought New Zealand";
	}if(e26 == false){
		g26 = "MAMAMIA. You bought Italy";
	}if(e27 == false){
		g27 = "OLE~. You bought Spain";
	}if(e28 == false){
		g28 = "Cookies is real. You bought Irseal";
	}if(e29 == false){
		g29 = "Port over here u gals, got a cookies?. You bought Portugal";
	}if(e30 == false){
		g30 = "Humble Beginnings. You bought Greece";
	}if(e1 == false && e2 == false && e3 == false && e4 == false && e5 == false && e6 == false && e7 == false && e8 == false && e9 == false && e10 == false && e11 == false && e12 == false && e13 == false && e14 == false && e15 == false && e16 == false && e17 == false && e18 == false && e19 == false && e20 == false && e21 == false && e22 == false && e23 == false && e24 == false && e25 == false && e26 == false && e27 == false && e28 == false && e29 == false && e30 == false ){
		g31 = "Now showing on the Cookie planet channel. YOU BOUGHT THE WORLD";
	}
	
	if(totalintrest >= 1){
		f1 = "Just the 1%. You have an Intrest rate at least at .01%";
	}if(totalintrest >= 10){
		f2 = "10% more than the start. You have an Intrest rate at least at .1%";
	}if(totalintrest >= 20){
		f3 = "20 hours later.... You have an Intrest rate at least at .2%";
	}if(totalintrest >= 33){
		f4 = "One-Third... 3.33333333333 u get the idea. You have an Intrest rate at least at .3%";
	}if(totalintrest >= 40){
		f5 = "Not quite 50%. You have an Intrest rate at least at .4%";
	}if(totalintrest >= 50){
		f6 = "50/50 Equal share. You have an Intrest rate at least at .5%";
	}if(totalintrest >= 75){
		f7 = "Best 3 outta 4. You have an Intrest rate at least at .75%";
	}if(totalintrest >= 110){
		f8 = "Give it 110%. You have an Intrest rate at least at 1%";
	}if(totalintrest >= 200){
		f9 = "Who needs 100% when u can have 200%. You have an Intrest rate at least at 2%";
	}if(totalintrest >= 300){
		f10 = "300% moe than you. You have an Intrest rate at least at 3%";
	}if(totalintrest >= 400){
		f11 = "Heheheh Its all about the cookies. You have an Intrest rate at least at 4%";
	}if(totalintrest >= 500){
		f12 = "500%? You killing the bank. You have an Intrest rate at least at 5%";
	}if(totalintrest >= 750){
		f13 = "Who's getting cookies? You or the bank?. You have an Intrest rate at least at 7.5%";
	}if(totalintrest >= 1000){
		f14 = "It's gotta be you the bank owner. You have an Intrest rate at least at 10%";
	}
	if(allinputbankcook >= 1){
		h1 = "At least 1 cookie is safe. You have placed at least 1 cookie in the bank"; 
	}if(allinputbankcook >= 100){
		h2 = "Cookies jar.  You have placed at least 100 cookies in the bank"; 
	}if(allinputbankcook >= 10000){
		h3 = "Cookie Box. You have placed at least 10000 cookies in the bank"; 
	}if(allinputbankcook >= 100000){
		h4 = "Cookie storage You have placed at least 100000 cookies in the bank"; 
	}if(allinputbankcook >= 1000000){
		h5 = "Gingerbread bank. You have placed at least 1000000 cookies in the bank"; 
	}if(allinputbankcook >= 1000000000){
		h6 = "Cookie is the new cash. You have placed at least 1000000000 cookies in the bank"; 
	}if(allintrestcook >= 1){
		h7 = "Here, Have a cookie. You have gained at least 1 cookie by intrest"; 
	}if(allintrestcook >= 100){
		h8 = "Have a gift box of cookies. You have gained at least 100 cookies by intrest"; 
	}if(allintrestcook >= 1000){
		h9 = "Wrapped like a cookie. You have gained at least 1000 cookies by intrest"; 
	}if(allintrestcook >= 100000){
		h10 = "Tis a boatfull of cookies You have gained at least 100000 cookies by intrest"; 
	}if(allintrestcook >= 1000000){
		h11 = "City of cookies. You have gained at least 1000000 cookies by intrest"; 
	}if(allintrestcook >= 1000000000){
		h12 = "Made by cookies, for cookies. You have gained at least 1000000000 cookies by intrest"; 
	}
	
	if(gc >= 1){
		d4 = "Lucky... You got 1 golden cookie";
	}if(gc >= 7){
		d5 = "Super Lucky. You got 7 golden cookie";
	}if(gc >= 77){
		d6 = "Amazingly lucky. You got 77 golden cookie";
	}
	String [] buttons = {"Cookies", "Upgrades", "Misc.","Bank","Earth", "Back"};
	int x = JOptionPane.showOptionDialog(null,"Achievements ", s + "'s Bakery", 0, JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons);
	if(x == 0){
		String [] buttons1 = {"Back"};
		int xx = JOptionPane.showOptionDialog(null,a +"\n"+ b +"\n"+ c +"\n"+ d +"\n"+ e +"\n"+ f +"\n"+ g +"\n"+ h +"\n"+ i +"\n"+ j +"\n"+ k+"\n"+ l+"\n"+ m+"\n"+ n+"\n"+ o+"\n"+ p+"\n"+ q+"\n"+ r+"\n"+ t+"\n"+ u+"\n"+v+"\n"+ w+"\n"+ y+"\n"+ yy+"\n"+ yyy+"\n"+ yyyy, s + "'s Bakery", 0, JOptionPane.INFORMATION_MESSAGE, null, buttons1, buttons1);
		if(xx == 0){
			achievements();
		}
	}else if(x == 1){
		String [] buttons2 = {"Back"};
		int xx = JOptionPane.showOptionDialog(null,a1 +"\n" +a2+"\n" +a3+"\n" +a4+"\n" +a5+"\n" +a6+"\n" +a7+"\n" +a8+"\n" +a9+"\n" +a10 +"\n" + b1 +"\n" +b2+"\n" +b3+"\n" +b4+"\n" +b5+"\n" +b6+"\n" +b7+"\n" +b8+"\n" +b9+"\n" +b10 +"\n"+ c1 +"\n" +c2+"\n" +c3+"\n" +c4+"\n" +c5+"\n" +c6+"\n" +c7+"\n" +c8+"\n" +c9+"\n" +c10 + "\n" +c11, s + "'s Bakery", 0, JOptionPane.INFORMATION_MESSAGE, null, buttons2, buttons2);
		if(xx == 0){
			achievements();
		}
	}else if(x == 2){
		String [] buttons3 = {"Back"};
		int xx = JOptionPane.showOptionDialog(null,zzz +"\n" +zz +"\n"+ zz1 +"\n"+ zz2 +"\n"+ zz3 +"\n"+ zz4 +"\n"+ zz5 +"\n"+ zz6 +"\n"+ zz7 +"\n"+ zz8+"\n"+ zz9+"\n"+ zz10+"\n"+ d1+"\n"+ d2+"\n"+ d3+"\n"+ m1+"\n"+ m2+"\n"+ m3+"\n"+ m4+"\n"+ m5+"\n"+ m6+"\n"+ m7+"\n"+ m8+"\n"+ m9+"\n"+ m10+"\n"+ d4+"\n"+ d5+"\n"+ d6, s + "'s Bakery", 0, JOptionPane.INFORMATION_MESSAGE, null, buttons3, buttons3);
		if(xx == 0){
			achievements();
		}
	}else if(x == 3){
		
		String [] buttons3 = {"Back"};
		int xx = JOptionPane.showOptionDialog(null, f1+"\n"+f2+"\n"+f3+"\n"+f4+"\n"+f5+"\n"+f6+"\n"+f7+"\n"+f8+"\n"+f9+"\n"+f10+"\n"+f11+"\n"+f12+"\n"+f13+"\n"+f14+"\n"+h1+"\n"+h2+"\n"+h3+"\n"+h4+"\n"+h5+"\n"+h6+"\n"+h7+"\n"+h8+"\n"+h9+"\n"+h10+"\n"+h11+"\n"+h12+"\n" + h13, s + "'s Bakery", 0, JOptionPane.INFORMATION_MESSAGE, null, buttons3, buttons3);
		if(xx == 0){
			achievements();
		}
	}else if(x == 4){
		String [] buttons3 = {"Back"};
		int xx = JOptionPane.showOptionDialog(null,g1 + "\n" +g2 + "\n" +g3 + "\n" +g4 + "\n" +g5 + "\n" +g6 + "\n" +g7 + "\n" +g8 + "\n" +g9 + "\n" +g10 + "\n" +g11 + "\n" +g12 + "\n" +g13 + "\n" +g14 + "\n" +g15 + "\n" +g16 + "\n" +g17 + "\n" +g18 + "\n" +g19 + "\n" +g20 + "\n" +g21 + "\n" +g22 + "\n" +g23 + "\n" +g24 + "\n" +g25 + "\n" +g26 + "\n" +g27 + "\n" +g28 + "\n" +g29 + "\n" +g30 + "\n" +g31 + "\n" + g32 , s + "'s Bakery", 0, JOptionPane.INFORMATION_MESSAGE, null, buttons3, buttons3);
		if(xx == 0){
			achievements();
		}
	}else if(x == 5){
		
		cookie();
	}
	
		cookie();
	}
	
	public void quit(){
		
		String uu = in("Are you sure u want to quit? \n" +
				"Type ( yes ) if you want to quit \n" +
				"Otherwise ingnore this message and click ok");
		if(uu.equals("yes")||uu.equals("Yes")){
		System.exit(0);	
		}else{
			cookie();
		}
		
	}
	
	int z = 0;
	int z1 = 0;
	int z2= 0;
	int z3 = 0;
	int z4 = 0;
	int z5 = 0;
	int z6 = 0;
	int z7 = 0;
	int z8 = 0;
	int z9 = 0;
	int z10 = 0;
	int mm10 = 0;
	
	int kkk = 0;
	public void name(){
		String t = in("Type your name");
		i++;
		s = t;
		if(s.equals("JJ") || s.equals("jj") || s.equals("Jj") || s.equals("jJ")){
			z = 1;
		}else if(s.equals("Casey") || s.equals("casey") || s.equals("Christina") || s.equals("christina") || s.equals("Jen") || s.equals("jen") || s.equals("Lucia") || s.equals("lucia") || s.equals("Jorge") || s.equals("jorge")|| s.equals("Julie")|| s.equals("julie")){
			z1 = 1;
		}else if(s.equals("God") || s.equals("god")){
			z2 = 1;
		}else if(s.equals("Rico") || s.equals("rico")){
			z3 = 1;
		}else if(s.equals("Cookie") || s.equals("cookie")){
			z4 = 1;
		}else if(s.equals("")){
			z5 = 1;
		}else if(s.equals("null")){
			z6 = 1;
		}else if(s.equals("Umi") || s.equals("umi")){
			z7 = 1;
		}else if(s.equals("Ethan") || s.equals("ethan")){
			z8 = 1;
		}else if(s.equals("Senpai") || s.equals("senpai")){
			z9 = 1;
		}else if(s.equals("Cookie Monster") || s.equals("Cookie monster")|| s.equals("cookie Monster")|| s.equals("cookie monster")){
			z10 = 1;
		}
		if(kkk == 0){
			kkk++;
		String [] buttons = {"Yes","No"};
		int x = JOptionPane.showOptionDialog(null,"Do you want to play the cookie clicker song?", s + "'s Bakery", 0, JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons);
		if(x == 0){
			mm10 = 1;
			S.music();
			cookie();
		}if(x == 1){
			cookie();
		}
		
		}
	}
	
	int mm1 = 0;
	int mm2 = 0;
	int mm3 = 0;
	int mm4 = 0;
	int mm5 = 0;
	int mm6 = 0;
	int mm7 = 0;
	int mm8 = 0;
	int mm9 = 0;
	
	
	public void play(){
		String [] buttons = {"2D Dream Fever", "Tokyo Teddy Bear", "Pokemon Theme Song", "Firework", "Only my Railgun","List Part 2", "Back"};
		int x = JOptionPane.showOptionDialog(null,"Song List Part 1", s + "'s Bakery", 0, JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons);
		
		if(x == 0){
			mm1 = 1;
			S.music1();
		}if(x == 1){
			mm2 = 1;
			S.music2();
		}if(x == 2){
			mm3 = 1;
			S.music3();
		}if(x == 3){
			mm4 = 1;
			S.music4();
		}if(x == 4){
			mm5 = 1;
			S.music5();
		}if(x == 5){
			String [] buttons1 = {"Magnetic Today", "Slumber Party", "Do you mind", "Day Dream Warriors","Cookie Clicker song", "List Part 1" ,"Back"};
			int y = JOptionPane.showOptionDialog(null,"Song List Part 2", s + "'s Bakery", 0, JOptionPane.INFORMATION_MESSAGE, null, buttons1, buttons1);
			
			if(y == 0){
				mm6 = 1;
				S.music6();
			}if(y == 1){
				mm7 = 1;
				S.music7();
			}if(y == 2){
				mm8 = 1;
				S.music8();
			}if(y == 3){
				mm9 = 1;
				S.music9();
			}if(y == 4){
				mm10 = 1;
				S.music();
			}if(y == 5){
				play();
			}if(y == 6){
				cookie();
			}
		}if(x == 6){
			cookie();
		}
		
	}
	
	double cookinbank = 0;
	double addcookinbank = 0;
	double takecookinbank = 0;
	double intrestrate = 0;
	double costintrest = 10000;
	double allinputbankcook = 0;
	double allintrestcook =0;
	double rate = 1;
	int totalintrest = 0;
	public void addbank(){
		double calcbank = 0;
		
		calcbank = cookinbank;
		calcbank *= rate;
		double er = (calcbank -= cookinbank);
		allintrestcook = er;
		cookinbank *= rate;
	}
	public void bank(){
		String [] buttons = {"Leave some Cookies ","Take some Cookies","Upgrade intrest rate","Back"};
		int x = JOptionPane.showOptionDialog(null, "Cookie Worthy Bank \n" +
				"All cookies are stored safely in the Cookie Bank \n " +
				"Number of cookies in bank " + cookinbank +"\n Intrest rate is "+ intrestrate +" % per click" 
				+ "\n Cost of upgrading intrest rate is " + costintrest, s + "'s Bakery", 0, JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons);
		
		if(x == 0){
			String u = in("How many cookies do you want to leave? \n" +
					"Cookies you have " + numcook);
			try{
			double d = Double.parseDouble(u);
			if(d <= numcook){
			if(d < 0){
				msg("Please enter a postive number");
				bank();
			}else{
				addcookinbank = d;
				cookinbank += addcookinbank;
				allinputbankcook += addcookinbank;
				numcook -= d;
				bank();
			}
			}else{
				msg("You don't have "+ d +" number of cookies to place in you only have "+ numcook);
				bank();
			}
			}
			catch(Exception e){
				msg("Please input a vaild number");
				bank();
			}
		}if(x == 1){
			String u = in("How many cookies do you want to take? \n" +
					"Cookies in the Bank " + cookinbank );
			try{
			double d = Double.parseDouble(u);
			if(d <= cookinbank){
			if(d < 0){
				msg("Please enter a postive number");
				bank();
			}else{
				takecookinbank = d;
				cookinbank -= takecookinbank;
				numcook += d;
				bank();
			}
			}else{
				msg("You are trying to take " + d +" cookies you only have " + cookinbank + " cookies in the bank");
			}
			}
			catch(Exception e){
				msg("Please input a vaild number");
				bank();
			}
		}if(x == 2){
			if(numcook >= costintrest){
				numcook -=  costintrest;
				costintrest *= 2;
				intrestrate += .001;
				totalintrest++;
				rate += .001;
				msg("Thank you for you cookie intrest purchase");
				bank();
			}else{
				msg("Not enough cookies");
			 	bank();
			}
		}if(x == 3){
			cookie();
		}
	
	}
	public void help(){ 
		msg("The name of the game is Cookie Clicker, So click the cookie to get cookies" +
				"\n Click on the Shop to go to the shop, to purchase basic upgrades for your clicker" +
				"\n Click on the Trophy to look at the achievements, there are 5 types of achievements, Cookies, Upgrades, Miscellanous, The Bank, and the Earth" +
				"\n Click on the My name is nametag so you can change your name" +
				"\n Click on the music icon to look at list of music that you can play(note you need access to the internet)" +
				"\n Click on the Bank icon to head to the bank to store your cookies and gain intrest" +
				"\n Click on the Earth icon to head to a list of countries that you can place stores in and have a worldwide cookie chain" +
				"\n Click on the Help icon to get Help!... but you knew that already... right?" +
				"\n Click on the Quit icon to Quit the game , it will ask you to confirm leaving the game" +
				"\n I wish the best of luck to you in your cookie career and make all the right choices and become a cookie overlord!" +
				"\n Running Cookie Clicker v6.3");
	}
	
	public void addearth(){
		
		addearth = 0;
		if(e1 == false){
			addearth += 1000000;
		}if(e2 == false){
			addearth += 100000;
		}if(e3 == false){
			addearth += 20000;
		}if(e4 == false){
			addearth += 15000;
		}if(e5 == false){
			addearth += 10000;
		}if(e6 == false){
			addearth += 7000;
		}if(e7 == false){
			addearth += 6500;
		}if(e8 == false){
			addearth += 6000;
		}if(e9 == false){
			addearth += 5500;
		}if(e10 == false){
			addearth += 5000;
		}if(e11 == false){
			addearth += 1400;
		}if(e12 == false){
			addearth += 1300;
		}if(e13 == false){
			addearth += 1200;
		}if(e14 == false){
			addearth += 1100;
		}if(e15 == false){
			addearth += 1000;
		}if(e16 == false){
			addearth += 900;
		}if(e17 == false){
			addearth += 800;
		}if(e18 == false){
			addearth += 700;
		}if(e19 == false){
			addearth += 600;
		}if(e20 == false){
			addearth += 500;
		}if(e21 == false){
			addearth += 100;
		}if(e22 == false){
			addearth += 90;
		}if(e23 == false){
			addearth += 80;
		}if(e24 == false){
			addearth += 70;
		}if(e25 == false){
			addearth += 60;
		}if(e26 == false){
			addearth += 50;
		}if(e27 == false){
			addearth += 40;
		}if(e28 == false){
			addearth += 30;
		}if(e29 == false){
			addearth += 20;
		}if(e30 == false){
			addearth += 10;
		}
		
		collect += addearth;
	}
	
	boolean e1 = true;
	boolean e2 = true;
	boolean e3 = true;
	boolean e4 = true;
	boolean e5 = true;
	boolean e6 = true;
	boolean e7 = true;
	boolean e8 = true;
	boolean e9 = true;
	boolean e10 = true;
	boolean e11 = true;
	boolean e12 = true;
	boolean e13 = true;
	boolean e14 = true;
	boolean e15 = true;
	boolean e16 = true;
	boolean e17 = true;
	boolean e18 = true;
	boolean e19 = true;
	boolean e20 = true;
	boolean e21 = true;
	boolean e22 = true;
	boolean e23 = true;
	boolean e24 = true;
	boolean e25 = true;
	boolean e26 = true;
	boolean e27 = true;
	boolean e28 = true;
	boolean e29 = true;
	boolean e30 = true;
	
	int totalearth = 0;
	double collect = 0;
	double addearth = 0;
	
	String aa = "A) Qatar's cost is 25000000000. It will give 1000000 cookies per click  ";
	String ab = " B) Luxembourg's cost is 10000000000. It will give 100000 cookies per click";
	String ac = "C) Singapore's cot is 7500000000. It will give 20000 cookies per click  ";
	String ad = " D) Norway's cost is 5000000000. It will give 15000 cookies per click";
	String ae = "E) Hong Kong's cost is 2500000000. It will give 10000 cookies per click  ";
	String af = " F) U.S.A.'s cost is 1000000000. It will give 7000 cookies per click";
	String ag = "G) Switzerland's cost is 750000000. It will give 6500 cookies per click  ";
	String ah = " H) Saudi Arabia's cost is 500000000. It will give 6000 cookies per click";
	String ai = "I) Netherlands's cost is 250000000. It will give 5500 cookies per click  ";
	String aj = " J) Ireland's cost is 100000000. It will give 5000 cookies per click";
	String ak = "K) Australia's cost is 75000000. It will give 1400 cookies per click  ";
	String al = " L) Austria's cost is 50000000. It will give 1300 cookies per click";
	String am = "M) Sweden's cost is 25000000. It will give 1200 cookies per click  ";
	String an = " N) Germany's cost is 10000000. It will give 1100 cookies per click";
	String ao = "O) Taiwan's cost is 7500000. It will give 1000 cookies per click";
	
	String ap = " A) Canada's cost is 5000000. It will give 900 cookies per click   ";
	String aq = "B) Denmark's cost is 2500000. It will give 800 cookies per click";
	String ar = " C) Iceland's cost is 1000000. It will give 700 cookies per click   ";
	String as1 = "D) Belgium's cost is 750000. It will give 600 cookies per click";
	String at = " E) France's cost is 500000. It will give 500 cookies per click   ";
	String au = "F) Finland's cost is 250000. It will give 100 cookies per click";
	String av = " G) U.K.'s cost is 100000. It will give 90 cookies per click   ";
	String aw = "H) Japan's cost is 75000. It will give 80 cookies per click";
	String aa1 = " I) Korea's cost is 50000. It will give 70 cookies per click   ";
	String aa2 = "J) New Zealand's cost is 25000. It will give 60 cookies per click";
	String aa3 = " K) Italy's cost is 10000. It will give 50 cookies per click   ";
	String aa4 = "L) Spain's cost is 5000. It will give 40 cookies per click";
	String aa5 = " M) Isreal's cost is 2500. It will give 30 cookies per click   ";
	String aa6 = "N) Portugal's cost is 1000. It will give 20 cookies per click";
	String aa7 = " O) Greece's cost is 500. It will give 10 cookies per click   ";

	public void earth(){
		
		String [] buttons = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","Part 2","Collect","Back"};
		int x = JOptionPane.showOptionDialog(null, "Welcome to the cookie earth \n" +
				"Here the top countries will be able to pay you in cookies once you place a bakery there \n" +
				"You will need buy a bakery per country, while the countries bake cookies they are not affected by cookie thiefs and cookie monsters \n " +
				"You also need to collect the cookies they baked when you need the countries cookies.\n" +
				"Head to the second part of the list if you want cheaper countries first \n" +
				"Cookies to be collected " + collect + "\n" + 
				aa + ab +"\n" +
				ac + ad +"\n" +
				ae + af +"\n" +
				ag + ah +"\n" +
				ai + aj +"\n" +
				ak + al +"\n" +
				am + an +"\n" +
				ao+ "\n" +
				"Click Part 2 for the rest of the countries", s + "'s Bakery", 0, JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons);
		if(x == 0){
			if(e1 == true){
				if(numcook >= 25000000000.0){
					aa = "You have Qatar   ";
					numcook -= 25000000000.0;
					totalearth++;
					msg("Thank you for you cookie country purchase");
					e1 = false;
					earth();
				}else{
					msg("Not enough cookies");
					earth();
				}
			}else{
				msg("You already bought this");
				earth();
			}
		}if(x == 1){
			if(e2 == true){
				if(numcook >= 10000000000.0){
					ab = "You have Luxembourg   ";
					numcook -= 10000000000.0;
					totalearth++;
					msg("Thank you for you cookie country purchase");
					e2 = false;
					earth();
				}else{
					msg("Not enough cookies");
					earth();
				}
			}else{
				msg("You already bought this");
				earth();
			}
		}if(x == 2){
			if(e3 == true){
				if(numcook >= 7500000000.0){
					ac = "You have Singapore  ";
					numcook -= 7500000000.0;
					totalearth++;
					msg("Thank you for you cookie country purchase");
					e3 = false;
					earth();
				}else{
					msg("Not enough cookies");
					earth();
				}
			}else{
				msg("You already bought this");
				earth();
			}
		}if(x == 3){
			if(e4 == true){
				if(numcook >= 5000000000.0){
					ad = "You have Norway   ";
					numcook -= 5000000000.0;
					totalearth++;
					msg("Thank you for you cookie country purchase");
					e4 = false;
					earth();
				}else{
					msg("Not enough cookies");
					earth();
				}
			}else{
				msg("You already bought this");
				earth();
			}
		}if(x == 4){
			if(e5 == true){
				if(numcook >= 2500000000.0){
					ae = "You have Hong Kong   ";
					numcook -= 2500000000.0;
					totalearth++;
					msg("Thank you for you cookie country purchase");
					e5 = false;
					earth();
				}else{
					msg("Not enough cookies");
					earth();
				}
			}else{
				msg("You already bought this");
				earth();
			}
		}if(x == 5){
			if(e6 == true){
				if(numcook >= 1000000000){
					af = "You have U.S.A.   ";
					numcook -= 1000000000;
					totalearth++;
					msg("Thank you for you cookie country purchase");
					e6 = false;
					earth();
				}else{
					msg("Not enough cookies");
					earth();
				}
			}else{
				msg("You already bought this");
				earth();
			}
		}if(x == 6){
			if(e7 == true){
				if(numcook >= 750000000){
					ag = "You have Switzerland   ";
					numcook -= 750000000;
					totalearth++;
					msg("Thank you for you cookie country purchase");
					e7 = false;
					earth();
				}else{
					msg("Not enough cookies");
					earth();
				}
			}else{
				msg("You already bought this");
				earth();
			}
		}if(x == 7){
			if(e8 == true){
				if(numcook >= 500000000){
					ah = "You have Saudi Arabia   ";
					numcook -= 500000000;
					totalearth++;
					msg("Thank you for you cookie country purchase");
					e8 = false;
					earth();
				}else{
					msg("Not enough cookies");
					earth();
				}
			}else{
				msg("You already bought this");
				earth();
			}
		}if(x == 8){
			if(e9 == true){
				if(numcook >= 250000000){
					ai = "You have Netherland   ";
					numcook -= 250000000;
					totalearth++;
					msg("Thank you for you cookie country purchase");
					e9 = false;
					earth();
				}else{
					msg("Not enough cookies");
					earth();
				}
			}else{
				msg("You already bought this");
				earth();
			}
		}if(x == 9){
			if(e10 == true){
				if(numcook >= 100000000){
					aj = "You have Ireland  ";
					numcook -= 100000000;
					totalearth++;
					msg("Thank you for you cookie country purchase");
					e10 = false;
					earth();
				}else{
					msg("Not enough cookies");
					earth();
				}
			}else{
				msg("You already bought this");
				earth();
			}
		}if(x == 10){
			if(e11 == true){
				if(numcook >= 75000000){
					ak = "You have Australia   ";
					numcook -= 75000000;
					totalearth++;
					msg("Thank you for you cookie country purchase");
					e11 = false;
					earth();
				}else{
					msg("Not enough cookies");
					earth();
				}
			}else{
				msg("You already bought this");
				earth();
			}
		}if(x == 11){
			if(e12 == true){
				if(numcook >= 50000000){
					al = "You have Austria   ";
					numcook -= 50000000;
					totalearth++;
					msg("Thank you for you cookie country purchase");
					e12 = false;
					earth();
				}else{
					msg("Not enough cookies");
					earth();
				}
			}else{
				msg("You already bought this");
				earth();
			}
		}if(x == 12){
			if(e13 == true){
				if(numcook >= 25000000){
					am = "You have Sweden   ";
					numcook -= 25000000;
					totalearth++;
					msg("Thank you for you cookie country purchase");
					e13 = false;
					earth();
				}else{
					msg("Not enough cookies");
					earth();
				}
			}else{
				msg("You already bought this");
				earth();
			}
		}if(x == 13){
			if(e14 == true){
				if(numcook >= 10000000){
					an = "You have Germany   ";
					numcook -= 10000000;
					totalearth++;
					msg("Thank you for you cookie country purchase");
					e14 = false;
					earth();
				}else{
					msg("Not enough cookies");
					earth();
				}
			}else{
				msg("You already bought this");
				earth();
			}
		}if(x == 14){
			if(e15 == true){
				if(numcook >= 7500000){
					ao = "You have Taiwan   ";
					numcook -= 7500000;
					totalearth++;
					msg("Thank you for you cookie country purchase");
					e15 = false;
					earth();
				}else{
					msg("Not enough cookies");
					earth();
				}
			}else{
				msg("You already bought this");
				earth();
			}
		}if(x == 15){
			String [] buttons1 = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","Back"};
			int y = JOptionPane.showOptionDialog(null, "Welcome to the cookie earth \n" +
					"Here the top countries will be able to pay you in cookies once you place a bakery there \n" +
					"You will need buy a bakery per country, while the countries bake cookies they are not affected by cookie thiefs and cookie monsters \n " +
					"You also need to collect the cookies they baked when you need the countries cookies.\n" +
					ap + aq +"\n" +
					ar + as1 +"\n" +
					at + au +"\n" +
					av + aw +"\n" +
					aa1 + aa2 +"\n" +
					aa3 + aa4 +"\n" +
					aa5 + aa6 +"\n" +
					aa7, s + "'s Bakery", 0, JOptionPane.INFORMATION_MESSAGE, null, buttons1, buttons1);
			
			if(y == 0){
				if(e16 == true){
					if(numcook >= 5000000){
						ap = "You have Canada   ";
						numcook -= 5000000;
						totalearth++;
						msg("Thank you for you cookie country purchase");
						e16 = false;
						earth();
					}else{
						msg("Not enough cookies");
						earth();
					}
				}else{
					msg("You already bought this");
					earth();
				}
			}if(y == 1){
				if(e17 == true){
					if(numcook >= 2500000){
						aq = "You have Denmark   ";
						numcook -= 2500000;
						totalearth++;
						msg("Thank you for you cookie country purchase");
						e17 = false;
						earth();
					}else{
						msg("Not enough cookies");
						earth();
					}
				}else{
					msg("You already bought this");
					earth();
				}
			}if(y == 2){
				if(e18 == true){
					if(numcook >= 1000000){
						ar = "You have Iceland   ";
						numcook -= 1000000;
						totalearth++;
						msg("Thank you for you cookie country purchase");
						e18 = false;
						earth();
					}else{
						msg("Not enough cookies");
						earth();
					}
				}else{
					msg("You already bought this");
					earth();
				}
			}if(y == 3){
				if(e19 == true){
					if(numcook >= 750000){
						as1 = "You have Belgium   ";
						numcook -= 750000;
						totalearth++;
						msg("Thank you for you cookie country purchase");
						e19 = false;
						earth();
					}else{
						msg("Not enough cookies");
						earth();
					}
				}else{
					msg("You already bought this");
					earth();
				}
			}if(y == 4){
				if(e20 == true){
					if(numcook >= 500000){
						at = "You have France   ";
						numcook -= 500000;
						totalearth++;
						msg("Thank you for you cookie country purchase");
						e20 = false;
						earth();
					}else{
						msg("Not enough cookies");
						earth();
					}
				}else{
					msg("You already bought this");
					earth();
				}
			}if(y == 5){
				if(e21 == true){
					if(numcook >= 250000){
						au = "You have Finland   ";
						numcook -= 250000;
						totalearth++;
						msg("Thank you for you cookie country purchase");
						e1 = false;
						earth();
					}else{
						msg("Not enough cookies");
						earth();
					}
				}else{
					msg("You already bought this");
					earth();
				}
			}if(y == 6){
				if(e22 == true){
					if(numcook >= 100000){
						av = "You have U.K.   ";
						numcook -= 100000;
						totalearth++;
						msg("Thank you for you cookie country purchase");
						e1 = false;
						earth();
					}else{
						msg("Not enough cookies");
						earth();
					}
				}else{
					msg("You already bought this");
					earth();
				}
			}if(y == 7){
				if(e23 == true){
					if(numcook >= 75000){
						aw = "You have Japan   ";
						numcook -= 75000;
						totalearth++;
						msg("Thank you for you cookie country purchase");
						e1 = false;
						earth();
					}else{
						msg("Not enough cookies");
						earth();
					}
				}else{
					msg("You already bought this");
					earth();
				}
			}if(y == 8){
				if(e24 == true){
					if(numcook >= 50000){
						aa1 = "You have Korea   ";
						numcook -= 50000;
						totalearth++;
						msg("Thank you for you cookie country purchase");
						e24 = false;
						earth();
					}else{
						msg("Not enough cookies");
						earth();
					}
				}else{
					msg("You already bought this");
					earth();
				}
			}if(y == 9){
				if(e25 == true){
					if(numcook >= 25000){
						aa2 = "You have New Zealand   ";
						numcook -= 25000;
						totalearth++;
						msg("Thank you for you cookie country purchase");
						e25 = false;
						earth();
					}else{
						msg("Not enough cookies");
						earth();
					}
				}else{
					msg("You already bought this");
					earth();
				}
			}if(y == 10){
				if(e26 == true){
					if(numcook >= 10000){
						aa3 = "You have Italy   ";
						numcook -= 10000;
						totalearth++;
						msg("Thank you for you cookie country purchase");
						e26 = false;
						earth();
					}else{
						msg("Not enough cookies");
						earth();
					}
				}else{
					msg("You already bought this");
					earth();
				}
			}if(y == 11){
				if(e27 == true){
					if(numcook >= 5000){
						aa4 = "You have Spain   ";
						numcook -= 5000;
						totalearth++;
						msg("Thank you for you cookie country purchase");
						e27 = false;
						earth();
					}else{
						msg("Not enough cookies");
						earth();
					}
				}else{
					msg("You already bought this");
					earth();
				}
			}if(y == 12){
				if(e28 == true){
					if(numcook >= 2500){
						aa5 = "You have Isreal   ";
						numcook -= 2500;
						totalearth++;
						msg("Thank you for you cookie country purchase");
						e28 = false;
						earth();
					}else{
						msg("Not enough cookies");
						earth();
					}
				}else{
					msg("You already bought this");
					earth();
				}
			}if(y == 13){
				if(e29 == true){
					if(numcook >= 1000){
						aa6 = "You have Portugal   ";
						numcook -= 1000;
						totalearth++;
						msg("Thank you for you cookie country purchase");
						e29 = false;
						earth();
					}else{
						msg("Not enough cookies");
						earth();
					}
				}else{
					msg("You already bought this");
					earth();
				}
			}if(y == 14){
				if(e30 == true){
					if(numcook >= 500){
						aa7 = "You have Greece  ";
						numcook -= 500;
						totalearth++;
						msg("Thank you for you cookie country purchase");
						e30 = false;
						earth();
					}else{
						msg("Not enough cookies");
						earth();
					}
				}else{
					msg("You already bought this");
					earth();
				}
			}if(y == 15){
				earth();
			}
		}if(x == 16){
			numcook += collect;
			collect = 0;
			earth();
		}if(x == 17){
			cookie();
		}
		
		
	}
}	