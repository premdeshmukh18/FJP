//prem deshmukh

#include<reg51.h>
void MSDelay(unsigned int itime){
 
     unsigned int i,j;
     for(i=0;i<itime;i++)
	  {

   for(j=0;j<1275;j++)
		{
		 }	
   }
 }


	void main(){
	
	unsigned int i;
		for(i=0;i<=255;i++)
		{
		
		P1=i;
		MSDelay(500);
		
		}
	
	}