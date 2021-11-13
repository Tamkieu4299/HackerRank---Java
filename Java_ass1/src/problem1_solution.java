import java.util.*;


public class problem1_solution {
	
	
	/* P1 */
	public static boolean canFollowRule(double length, int n, double min) {
		if(n!=1) {
			if(length/(n-1)>=min) {
				return true;
			}
			else{
				return false;
			}
		}
		else {
			return true;
		}
	}
	
	/* P2 */
	public static boolean isFollowingRule(double[] locations, double min) {
		int prevI = 0;
		int curI = 1;
		boolean flag = true;
		while(curI<locations.length) {
			if(locations[curI] - locations[prevI] >= min) {
				curI += 1;
				prevI +=1;
				continue;
			}
			else {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	/* P3 */
	public static boolean isFollowingRealRule(double[] locations, boolean[] protect, double min) {
		boolean flag = true;
		int cur = 0;
		int forwd = locations.length - 1 ;
		while(true) {
			
			if(locations.length == 1) {
				break;
			}	
			
			if(forwd < 0) {
				locations = Arrays.copyOfRange(locations, 0, locations.length - 1);
				return isFollowingRealRule(locations, protect, min);
			}
			
			if(locations[forwd]-locations[cur] >= min) {
				forwd -= 1;
				continue;
			}
			
			else {
				if(protect[cur] == true || protect[forwd] == true) {
					cur += 1;
					forwd -= 1;
					continue;
				} 
				else {
					flag = false;
					break;
				}
			}
		}
		return flag;	
	}
	

	public static void main(String[] args) {
		
		System.out.println(canFollowRule(0.1, 1, 0.0001));
		
		System.out.println(isFollowingRule(new double[]{0.0, 1.5, 4.5, 10.0}, 2.0));
		
		System.out.println(isFollowingRealRule(new double[]{0.0, 0.5, 1.0, 1.5, 2.1}, new boolean[]{false, true, true, true, false}, 2.0));
	}

}
