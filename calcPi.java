/**
* Approximate pi with Monte Carlo Simulation
*/
public class calcPi{

	public static void main(String[] args){
		
		int x = 0;
		
		//print every n-th value
		int prints = 100000;
		//amount of runs
		int runs = 10000000;
		
		for(int n=0;n<=runs;n++){
			if(n/prints>x){
				System.out.println("n =" + n +"roughPi ="+ MCS(n));
				x++;
			}
		}
	}
	public static double MCS(int n){
		double inside = 0.0;
		
		for (int i =0; i<n;i++){
			
			//create random point
			double x = Math.random();
			double y = Math.random();
		
		
			if(x*x + y*y <=1){
				inside++;
			}
		}
		return 4*(inside/n);
	}
}