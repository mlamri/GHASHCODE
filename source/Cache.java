public class Cache {
	private int idCache;
	private int capacity;
	private List<Video> list;
	private int capaciteRestante;

	public Cache(int id,int c){
		idCache = id;
		capacity = c;
		capaciteRestante = capacity;
  }

  public void addVideo(Video v) {
	  	if(capaciteRestante - v.getLength() >= 0) {
	  		list.add(v);
	  		capaciteRestante - v.length;
	  	}
	  	else
 	 		System.out.println("plus de place");
 	}
}
