package week5homework;

public class GiftList {
	private Node head;
	
	public GiftList() {
		head = null;
	}
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		Node temp = new Node();
		if (temp == null) {
			return true;
		} else {
			temp = null;
			return false;
		}
	}
	
	public boolean addGiftBasketToEnd(GiftBasket data) {
		if (isFull()) {
			System.out.println("List full! Unable to add to back!");
			return false;
		} else {
			Node nextItem = new Node();
			nextItem.setData(data);
			if (isEmpty()) {
				head = nextItem;
			} else {
				Node current = head;
				while (current.getNext()!=null) {
					current = current.getNext();
				}
				current.setNext(nextItem);
			}
			return true;
		}
	}

	public void showAllGiftBaskets() {
		if (isEmpty()) {
			System.out.println("The list is empty!");
		} else {
			Node current = head;
			while (current != null) {
				current.getData().display();
				current = current.getNext();
			}
		}
	}
}
