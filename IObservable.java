public interface IObservable {
	//register and unregister the observer object
	public void register(IObserver observer);
	public void unregister(IObserver observer);

	//notify the observer of change
	public void notifyObservers();

	//get updates from IObservable
	public Object getUpdate(IObserver observer);

}
