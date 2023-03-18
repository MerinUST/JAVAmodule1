package dip;

public interface IWorker {
	public void work();

}
class worker1 implements IWorker{
	public void work() {
		//..working
	}
}
class SuperWorker2 implements IWorker{
	public void work() {
		//..working
	}
}
class Manager2{
	IWorker worker;
	public void setWorker(IWorker w) {
		worker =w;
		
	}
	public void manage() {
		worker.work();
	}
}