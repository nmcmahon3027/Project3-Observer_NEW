public interface IObserver  {

	//updates the observer, used by IObservable
	public void update();

	//attach w/ IObservable to observe
	public void setIObservable(IObservable iObservable);
}

