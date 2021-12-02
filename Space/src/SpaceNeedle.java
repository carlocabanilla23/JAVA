
/*John Carlo Cabanilla
 * CSI 142
 * Space Needle Project
 * 
 * 
 */
public class SpaceNeedle {
	public static int size = 10;
	public static void main(String[] args){
		//antenna
		stick();
		
		
		//head

		top();
		bottom();
		stick();
		body();
		top();
	
		}

		
	
	public static void top(){
		int i,j,k,l,m,n,o,p,q;
		
		for (i=1;i<=size;i++){
			
			for(m=size;m>=i;m--){
				System.out.print("   ");
				
			}
			for (k=1;k<=1;k++){
				System.out.print("__/");
				
			}
			for(l=2;l<=i;l++){
				System.out.print(":::");
				
			}
			for (n=1;n<=1;n++){
				System.out.print("||");
			}
			for(p=2;p<=i;p++){
				System.out.print(":::");
				
				
			}
			for(o=1;o<=1;o++){
				System.out.print("\\__");	
				
			}
			
		
			
			System.out.print("\n");
			
		}
		System.out.print("   |");
		for(q=1;q<=size;q++ ){
			System.out.print("\"\"\"\"\"\"");
			
		}
		System.out.print("|");
	System.out.print("\n");
		
		
		
		
	}



public static void bottom(){
	int ii,kk,ll,jj,nn,lm;
	for (ii=1;ii<=size;ii++){
		for(jj=1;jj<=ii;jj++){
			System.out.print("  ");
		}
		for(kk=1;kk<=1;kk++){
				System.out.print(" \\_");	
		}
		for(ll=size;ll>=ii;ll--){
			System.out.print("/\\");
			
			
		}
		for(lm=2;lm<=size;lm++){
			System.out.print("/\\");	
		}
		for(ll=size;ll>=ii;ll--){
			System.out.print("/\\");	
		}
		for(nn=1;nn<=1;nn++){
			System.out.print("_/");
		}
		System.out.print("\n");
	}
}
public static void stick(){
	int a,b;
	
	for(a=1;a<=size;a++){
		for(b=0;b<=size;b++){
			System.out.print("   ");
			
		}
		System.out.print("||");
		System.out.print("\n");
		
	}
	
}
public static void body(){


	int newSize,bodySize;
	////////////////
	bodySize = size-2;
	newSize = (2+(size*3))-bodySize;
	
	for(int j=0;j<size*3;j++){
	    	
	for (int i =0; i<newSize;i++){
	    	System.out.print(" ");
	    
	}
	System.out.print("|");
	for (int i =0; i<size-2;i++){
	    	System.out.print("%");
	}
		System.out.print("|");
		System.out.print("|");
		for (int i =0; i<size-2;i++){
	    	System.out.print("%");
	}
	System.out.println("|");
	    
	}

	
	//////

}}