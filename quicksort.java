import java.util.ArrayList;

public class quicksort{
	public static void main(String[] args){
		int[] lst = new int[args.length];
		for(int i = 0; i < args.length; i++){
			lst[i] = Integer.parseInt(args[i]);
		}
		lst = qs(lst);
		for(int a : lst){
			System.out.print(a + " ");
		}
		System.out.println("");
	}
	public static int[] qs(int[] lst){
		if(lst.length == 0 || lst.length == 1){
			return lst;
		}
		int pivot = lst[0];
		ArrayList<Integer> lesser = new ArrayList<Integer>();
		ArrayList<Integer> greater = new ArrayList<Integer>();

		for(int i = 1; i < lst.length; i++){
			if(lst[i] <= pivot){
				lesser.add(lst[i]);
			}
			else{
				greater.add(lst[i]);
			}
		}

		int[] less = new int[lesser.size()];
		int[] great = new int[greater.size()];

		for(int j = 0; j < lesser.size(); j++){
			less[j] = lesser.get(j);
		}
		for(int k = 0; k < greater.size(); k++){
			great[k] = greater.get(k);
		}

		less = qs(less);
		great = qs(great);
		ArrayList<Integer> sorted = new ArrayList<Integer>();

		for(int z = 0; z < less.length; z ++){
			sorted.add(less[z]);
		}

		sorted.add(pivot);

		for(int m = 0; m < great.length; m++){
			sorted.add(great[m]);
		}
		
		int[] done = new int[sorted.size()];
		for(int n = 0; n < sorted.size(); n++){
			done[n] = sorted.get(n);
		}

		return done;
	} 
}