import java.util.Arrays;

public class OfficeParking {
	public static int spacesUsed(String[] events) {
		int count = 0;
		String[] spots = new String[events.length];
		String name = null;
		String action = null;
		for (int i = 0; i < events.length; i++) {
			int index = events[i].indexOf(" ");
			name = events[i].substring(0, index);
			action = events[i].substring(index + 1);
			if(action.equals("arrives")){
				int pos=findSpot(name,spots,action);
				spots[pos]=name;
			}else if(action.equals("departs")){
				findSpot(name,spots,action);
			}
		}
		for(int i=0;i<spots.length;i++){
			if(spots[i]==null)break;
			count++;
			
		}
		
		return count;
	}
	private static int findSpot(String name,String[] spots,String action){
		int i=0;
		for(i=0;i<spots.length;i++){
			if(action.equals("arrives")){
				if(spots[i]==null) break;
				if(spots[i].equals("free"))return i;
			}else if(action.equals("departs")){
				if(spots[i].equals(name)){
					spots[i]="free";
					return -1;
				}
			}
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] events = {
				{ "Alice arrives", "bob arrives", "Alice departs",
						"Charles arrives", "bob departs", "Charles departs" },
				{ "AdminBrett arrives", "lbackstrom arrives",
						"AdminBrett departs", "mike arrives",
						"TheFaxman arrives", "AdminBrett arrives",
						"lbackstrom departs", "dok arrives",
						"AdminBrett departs", "gt arrives",
						"AdminBrett arrives", "lbackstrom arrives",
						"AdminBrett departs", "jhughes arrives",
						"jhughes departs", "TheFaxman departs",
						"MaryJoe arrives", "AdminBrett arrives",
						"AdminBrett departs", "AdminBrett arrives" },
				{ "SnapDragon arrives", "tomek arrives",
						"JohnDethridge arrives", "ZorbaTHut arrives",
						"snewman arrives", "reid arrives", "NGBronson arrives",
						"Yarin arrives", "bstanescu arrives",
						"mathijs arrives", "radeye arrives",
						"bladerunner arrives", "dgarthur arrives",
						"venco arrives", "dmwright arrives",
						"WishingBone arrives", "Eryx arrives",
						"antimatter arrives", "ChristopherH arrives",
						"lars arrives", "biggnate arrives",
						"JanKuipers arrives", "dary arrives", "haha arrives",
						"grotmol arrives", "XuChuan arrives", "Ryan arrives",
						"LunaticFrindge arrives", "Wasteland arrives",
						"RunningWild arrives", "hampster arrives",
						"RalphFurmaniak arrives", "kyky arrives",
						"qubits arrives", "Rustyoldman arrives",
						"turuthok arrives", "Vulpecular arrives",
						"Eeyore arrives", "wackes arrives", "Ishan arrives",
						"dimkadimon arrives", "dplass arrives",
						"Olorin arrives", "TangentZ arrives",
						"NeverMore arrives", "Pops arrives", "srowan arrives",
						"tjq arrives", "vorthys arrives", "schveiguy arrives" },
				{ "AdminBrett arrives", "AdminBrett departs",
						"AdminBrett arrives", "AdminBrett departs",
						"AdminBrett arrives", "AdminBrett departs",
						"AdminBrett arrives", "AdminBrett departs",
						"AdminBrett arrives", "AdminBrett departs",
						"AdminBrett arrives", "AdminBrett departs",
						"AdminBrett arrives", "AdminBrett departs",
						"AdminBrett arrives", "AdminBrett departs" },
				{ "snapdragon arrives", "SnapDragon arrives",
						"AdminBrett arrives", "AdminBrett departs",
						"SnapDragon departs", "snapdragon departs" },
				{ "departs arrives", "arrives arrives", "arrives departs",
						"departs departs" } };
		
		for(int i=0;i<events.length;i++){
			System.out.println(spacesUsed(events[i]));
		}
	}

}
