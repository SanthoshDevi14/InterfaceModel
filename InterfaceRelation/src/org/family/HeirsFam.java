package org.family;

public class HeirsFam  implements FamilyTree{

	@Override
	public void grandParents() {
		System.out.println("GrandParent Name is Sellappa ");// TODO Auto-generated method stub
		
	}
	
	void grandChildren1( String name) {
		
		System.out.println("GrandChildren Name is " + name);
	}
	
	public static void main (String args[]) {
		
		HeirsFam ft= new HeirsFam();
		ft.grandParents();
		ft.grandChildren();
		ft.grandChildren1("Ammu");
	}

	@Override
	public void grandChildren() {
		System.out.println("GrandChildren Name is Santhosh Devi ");// TODO Auto-generated method stub
		
	}
	
}
