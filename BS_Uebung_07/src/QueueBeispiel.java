import java.util.LinkedList;
import java.util.Queue;

public class QueueBeispiel {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();

		queue.offer("Brot");
		queue.offer("Brot");
		queue.offer("Brot");
		queue.offer("Brot");
		
		queue.poll();

		queue.offer("Semmel");

		while ( !queue.isEmpty() )
		  System.out.println("Konsumiere " + queue.poll() );
		
	}

}
