package loggingprgrm2;


public class HouseConst {

	int Construct(String c,int cost)
	{
		int estmateConstrucioncost; 
		if(c=="StandMatrl")
		{
			return estmateConstrucioncost=1200*cost;
		}
		if(c=="AboveStandMatrl")
		{
			return estmateConstrucioncost=1500*cost;
		}
	  if(c=="HighStandMatrl")
		{
			return  estmateConstrucioncost=1800*cost;
		}
	 if(c=="HighStandMatrl"&& c=="FullyAutomatedHome)")
		{
			 return estmateConstrucioncost=2500*cost;
		}
	 else
		return 0;
		
	}
	
}
