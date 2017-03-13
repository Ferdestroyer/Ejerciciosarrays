package Ejercicio2arrays;

public class Vector {
	
	private	int v[];
	
		
	public  Vector(int mo){
		v=new int [mo];
	}
	
	public  Vector(int mo, int m){
		v=new int [mo];
		for (int i=0; i<mo; i++) {
			v[i]=m;
		}


	}
		
	public Vector(int mo, int desde, int hasta){
		
		v=new int [mo];
		for (int i=0; i<mo; i++) {
			v[i]=(int) (Math.random()*(hasta-desde+1)+desde);
		}
	}
	public Vector suma2vectores(Vector OtroVector){
		Vector sumar=null;
		//
		//return sumar;
		if(v.length==OtroVector.v.length){
			sumar=new Vector(v.length);
			for(int i=0; i<v.length; i++){
				sumar.v[i]=v[i]+OtroVector.v[i];
			}
			
		}
		return sumar;
		
	}

	
	public void Ordenar(){
			for(int i=0;i<(v.length-1);i++){
				for(int j=i+1;j<v.length;j++){
					if(v[i]>v[j]){
					//Intercambiamos valores
						int variableauxiliar=v[i];
						v[i]=v[j];
						v[j]=variableauxiliar;

				}
			}
		}
	}
	

	
	
	
	public void imprimeVector(){
		System.out.println();
		for(int k=0; k<v.length; k++){
			System.out.print(v[k]+" * ");
		}
		System.out.println();
	}
	
	
}

