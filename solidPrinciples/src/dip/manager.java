package dip;

public class manager {
	worker worker;
	public void setWorker(worker w) {
		worker =w;
	}
public void manager() {
	worker.work();
}
}
