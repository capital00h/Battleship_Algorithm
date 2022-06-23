package battleship_attempt_1_hunt_target_parity_1;
import java.util.*;
public class battleship_1_hunt_target_3 {
	public static int d2=0;
	public static int uc=0;
	public static int sl=2;
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Integer> sll = new ArrayList<>();


	public static void form(int[][]b) {
		for (int i =0; i<11;++i) {
			b[0][i]=i;
			b[i][0]=i;

		}
		for (int i =1; i<11;++i) {
			for (int j =1; j<11;++j) {
				b[i][j]=0;
			}
		}
		for(int i =0 ;i<11;++i) {
			for (int j =0;j<11;++j) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void  print(int b[][]) {
		for(int i =0; i<b.length;++i) {
			for (int j =0; j<b.length;++j){
				System.out.print(b[i][j]+ "  ");
			}
			System.out.println();
		}
	}
	public static void hunt_coord(int [][]b ) {

		int hm;
		int b2;
		for(int i =1; i<11;++i) {
			for(int j =1 ;j<11;++j) {
				b2=i-j;
				if(d2!=17) {
					if((b2)%sl==0&&b[i][j]!=1) {
						System.out.println("The given coordinates to attack is "+ i+" , "+j);
						System.out.println("Was it a hit(1) or miss(0) ? ");
						hm=sc.nextInt();
						if(hm==1) {
							d2=d2+1;

							target_coord(b,i,j,hm);

						}
						else if(hm==0) {
							System.out.println("It's ok soldier we missed Recalibrate the missiles and wait for further coordinates ");
							b[i][j]=1;


						}

					}

				}
				else {

					j=11;
					i=11;




				}
			}
		}
	}

	public static void target_coord(int [][]b ,int x, int y,int hm) {
		if(d2!=17) {
			int d1,f1=0;
			if(d2>1) {
				while(f1==0) {
					System.out.println("Sailors we hit "+d2+" targets give me a report if any enemy ships were sunked  ");
					System.out.println("Choose the ship ");
					System.out.println("1 : Carrier = length 5 ");
					System.out.println("2 : Battleship = length 4 ");
					System.out.println("3 : Cruiser = length 3 ");
					System.out.println("4 : Submarine = length 3 ");
					System.out.println("5 : Destroyer = length 2 ");
					System.out.println("6 : None ");
					d1=sc.nextInt();
					switch(d1) {
					case 5:
						if(sll.contains(2)) {
							f1=1; 
							sll.set(0, 0);
							sll.set(5, (sll.get(5)-2));
							System.out.println("Good Job Sailer we sunked a Destroyer .");
							System.out.println("Recalibrating the targeting mode !!! ");
							if(sll.contains(3)){
								sl=3;
							}
							else if(sll.contains(4)){
								sl=4;
							}
							else if(sll.contains(5)){
								sl=5;
							}
						}
						else {
							System.out.println("Is this somekind of joke for you sailor get the correct report GODDAM IT ");
							System.out.println("Destroyer is already sanked ");
							f1=0;
						}
						break;
					case 4 :
						if(sll.contains(3)) {
							f1=1;
							sll.set(1, 0);
							sll.set(1, (sll.get(5)-3));
							System.out.println("Good Job Sailer we sunked a Submarine .");
							System.out.println("Recalibrating the targeting mode !!! ");
							if (sll.contains(2)) {
								sl=2;

							}
							else if(sll.contains(3)) {
								sl=3;
							}
							else if(sll.contains(4)) {
								sl=4;
							}
							else if(sll.contains(5)) {
								sl=5;
							}
						}
						else {
							System.out.println("Is this somekind of joke for you sailor get the correct report GODDAM IT ");
							System.out.println("Submarine is already sanked ");
							f1=0;
						}
						break;
					case 3 :
						if(sll.contains(3)) {
							f1=1;
							sll.set(2, 0);
							sll.set(2, (sll.get(5)-3));
							System.out.println("Good Job Sailer we sunked a Cruiser .");
							System.out.println("Recalibrating the targeting mode !!! ");
							if(sll.contains(2)) {
								sl=2;
							}
							else if(sll.contains(3)) {
								sl=3;
							}
							else if(sll.contains(4)) {
								sl=4;
							}
							else if(sll.contains(5)) {
								sl=5;
							}
						}
						else {
							System.out.println("Is this somekind of joke for you sailor get the correct report GODDAM IT ");
							System.out.println("Cruiser is already sanked ");
							f1=0;
						}
						break;
					case 2 :
						if(sll.contains(4)) {
							sll.set(3, 0);
							f1=1;
							sll.set(3, (sll.get(5)-4));
							System.out.println("Good Job Sailer we sunked a Battleship .");
							System.out.println("Recalibrating the targeting mode !!! ");
							if(sll.contains(2)) {
								sl=2;
							}
							else if(sll.contains(3)) {
								sl=3;
							}
							else if(sll.contains(4)) {
								sl=4;
							}
							else if(sll.contains(5)) {
								sl=5;
							}
						}
						else {
							System.out.println("Is this somekind of joke for you sailor get the correct report GODDAM IT ");
							System.out.println("Battleship is already sanked ");
							f1=0;
						}
						break;
					case 1:
						if(sll.contains(5)) {
							sll.set(4, 0);
							sll.set(4, (sll.get(5)-5));
							f1=1;
							System.out.println("Good Job Sailer we sunked a Carrier .");
							System.out.println("Recalibrating the targeting mode !!! ");

							if(sll.contains(2)) {
								sl=2;
							}
							else if(sll.contains(3)) {
								sl=3;
							}
							else if(sll.contains(4)) {
								sl=4;
							}
							else if(sll.contains(5)) {
								sl=5;
							}
						}
						else {
							System.out.println("Is this somekind of joke for you sailor get the correct report GODDAM IT ");
							System.out.println("Battleship is already sanked ");
							f1=0;
						}
						break;
					case 6 :
						System.out.println("We are getting close to our victory dont be dishearted ");

						f1=1;
						break;
					}
				}
			}


			if (hm==1 && b[x][y]!=1 &&sll.get(5)!=0) {
				b[x][y]=1;

				System.out.println("missile used " + uc);
				System.out.println(x+"   "+y);
				System.out.println("We got a hit salior we are going in targeting mode . BUCKLE UP SAILORS !!!");
			}
			if( y!=1 &&b[x][y-1]!=1&&sll.get(5)!=0) {
				System.out.println("Recalibrate the missiles to "+ "[ "+x+" , "+(y-1)+"]");
				b[x][y-1]=1;
				System.out.println("Was it a hit(1) or miss(0) ");
				hm= sc.nextInt();
				if(hm==1 ) {
					System.out.println("missile used " + uc);
					System.out.println(x+"   "+y);
					d2=d2+1;
					target_coord(b,x,y-1,hm);

				}
				else {
					System.out.println("missile used " + uc);
					System.out.println(x+"   "+y);

					System.out.println("It's ok soldier we missed , Recalibrate the missiles and wait for further coordinates ");
					System.out.println("Listen up sailor we are going back into hunting mode ");
				}
			}
			if(x!=1  && b[x-1][y]!=1 && sll.get(5)!=0) {
				System.out.println("Recalibrate the missiles to "+"[ "+ (x-1)+" , "+y+"]");
				b[x-1][y]=1;
				System.out.println("Was it a hit(1) or miss(0) ");
				hm= sc.nextInt();
				if(hm==1) {
					System.out.println("missile used " + uc);
					System.out.println(x+"   "+y);

					d2=d2+1;
					target_coord(b,x-1,y,hm);

				}
				else {
					System.out.println("missile used " + uc);
					System.out.println(x+"   "+y);

					System.out.println("It's ok soldier we missed , Recalibrate the missiles and wait for further coordinates ");
					System.out.println("Listen up sailor we are going back into hunting mode ");
				}
			}
			if (x!=10   && b[x+1][y]!=1  && sll.get(5)!=0) {
				System.out.println("Recalibrate the missiles to "+ "[ "+(x+1)+" , "+y+"]");
				b[x+1][y]=1;
				System.out.println("Was it a hit(1) or miss(0) ");
				hm= sc.nextInt();
				if(hm==1) {
					System.out.println("missile used " + uc);
					System.out.println(x+"   "+y);

					d2=d2+1;
					target_coord(b,x+1,y,hm);

				}
				else {
					System.out.println("missile used " + uc);
					System.out.println(x+"   "+y);

					System.out.println("It's ok soldier we missed , Recalibrate the missiles and wait for further coordinates ");
					System.out.println("Listen up sailor we are going back into hunting mode ");
				}
			}
			if(y!=10    && b[x][y+1]!=1  && sll.get(5)!=0) {
				System.out.println("Recalibrate the missiles to "+"[ "+ x+" , "+(y+1)+"]");
				b[x][y+1]=1;
				System.out.println("Was it a hit(1) or miss(0) ");
				hm= sc.nextInt();
				if(hm==1) {
					System.out.println("missile used " + uc);
					System.out.println(x+"   "+y);

					d2=d2+1;

					target_coord(b,x,y+1,hm);

				}
				else {
					System.out.println("missile used " + uc);
					System.out.println(x+"   "+y);

					System.out.println("It's ok soldier we missed , Recalibrate the missiles and wait for further coordinates ");
					System.out.println("Listen up sailor we are going back into hunting mode ");
				}
			}
		}
	}

	public static void missile_used(int [][]b) {
		for (int i=1;i<11;++i) {
			for(int j=1;j<11;++j) {
				if( b[i][j]==1)
					uc=uc+1;
			}
		}
	}
	public static int summ(ArrayList<Integer>sll) {
		int s=0;
		for (int i =0; i<sll.size();++i) {
			s=s+sll.get(i);
		}
		return s;
	}



	public static void main(String args[]) {
		int [][]b = new int[11][11];
		sll.add(2);
		sll.add(3);
		sll.add(3);
		sll.add(4);
		sll.add(5);
		int g1= summ(sll);
		sll.add(g1);
		form(b);
		hunt_coord(b);
		missile_used(b);
		System.out.println("Number of missile used "+ uc);
		System.out.println("Number of targets hit  "+ d2);
		print(b);


	}
}
