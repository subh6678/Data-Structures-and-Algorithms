class Link {
	public String name;
	public float average;
	public Link Next;
	
	public Link(String name, float average){
		this.name = name;
		this.average = average;
		this.Next = null;
	}

	public void displayDetails() {
		System.out.println("Name: "+this.name +"\n"+ "Average: " + this.average);
	}
}

class LinkList {
	private Link first;

	public LinkList() {
		this.first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	public void insertFirst(String name, float average) {
		Link newLink = new Link(name, average);
		newLink.Next = this.first;
		this.first = newLink;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.Next;
		return temp;
	}

	public void displayList() {
		Link current = first;
		
		while(current != null) {
			current.displayDetails();
			current = current.Next;
		}
	}
	
	public Link deleteLink(String name) {
		Link current = first;
		Link previous = first;
		
		while(current.name != null) {
			if(current.Next == null) {
				return null;
			}
			else {
				previous =  current;			
			}
		}
		if(current == first) {
			first = first.Next;	
		}
		else {
			previous.Next = current.Next;
		}
		return current;
	}
	
}


public class LinkListDataStructure{

	public static void main(String[] args) {

		
		LinkList list = new LinkList();
		list.insertFirst("Nipuna",(float)45.04);
		list.insertFirst("Aravinda",(float)56.04);
		list.insertFirst("Prashani",(float)85.04);
		list.displayList();
		
		System.out.println("\n\n");
		list.deleteFirst();
		list.displayList();
	}
}
