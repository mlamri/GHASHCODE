import java.io.*;

public class Parser {


	//fichier d'entrée
	private String inputfile;
	private String extension;
	
	//données à paser
	private int idVideos, idEndopoints, idRequests, idCaches, capacites;
	
	private int[] videos;
	private Cache[] caches;
	private Endpoint[] endpoints;
	private PriorityQueue<Request> requests;
	
	//private String outputfile;
	
	

	public Parser(String s)
	{
		this.inputfile = s.substring(0,s.lastIndexOf('.'));
		this.extension = s.substring(s.lastIndexOf('.'), s.length());
		this.readFile();
	}





	private void readFile() {
		File inputFile = new File(this.inputfile + this.extension);
		
		try{
			Scanner in = new Scanner(inputFile);
			this.idVideos = in.nextInt();
			this.idEndopoints = in.nextInt();
			this.idRequests = in.nextInt();
			this.idCaches = in.nextInt();
			this.capacites = in.nextInt();
			
			//caches
			this.caches = new Cache[this.idCaches];
			
			for(int i = 0; i < this.idCaches; i++){
				this.caches[i] = new Cache(this.capacites);
			}
			
			//videos
			
			this.videos = new int[idVideos];
			for(int i = 0; i < this.idVideos; i++){
				this.videos[i] = in.nextInt();
			}
			
			//endpoints
			
			this.endpoints = new Endpoint[this.idEndopoints];
			for(int i = 0; i < this.idEndopoints; i++){
				Endpoint tp = new Endpoint();
				tp.
			}
		}
	}





	public void writeFile(String file) {
		
	}
}
