public class App {
	 
	public static void main(String[] args) {
		 
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		
		plant1.grow(); //Plant growing.
		tree.grow();   //Tree grow.
		plant2.grow(); //Tree grow.
		
		tree.shedLeaves();
		
		doGrow(plant1);  //Tree grow.
		doGrow(tree);    //Tree grow.
		doGrow(plant2);  //Tree grow.
		
	}
	
	public static void doGrow(Plant plant){
		
		plant.grow();
	}
}

 