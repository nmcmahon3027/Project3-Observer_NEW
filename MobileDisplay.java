<<<<<<< HEAD
=======


//MobileDisplay is one display type that the observer can use
//They register to this view/display to get updates

>>>>>>> parent of cf6eb52... Project#4: Visitor Pattern
public class MobileDisplay implements IObserver {

	private String name;
	private MobileDisplay topic;

	public MobileDisplay(String nm) {//nm
		this.name = nm;//=nm
	}

	public MobileDisplay() {

	}

	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if (msg == null) {
			System.out.println(name + ":: No new message");
		} else
			System.out.println(name + ":: Consuming message::" + msg);
	}

	private Object getUpdate(MobileDisplay mobileDisplay) {
		return mobileDisplay;
	}

	@Override
	public void setIObservable(IObservable iObservable) {

	}

	//@Override
	public void setMobileDisplay(MobileDisplay mobileDisplay) {
		this.topic = mobileDisplay;
	}


	public void postMessage(String new_message) {
		System.out.println("New Message: ");
	}

	public void register(IObserver obj1) {
		if(obj1.equals(obj1)){
			System.out.println("registered object1! ");
		}
	}
}

