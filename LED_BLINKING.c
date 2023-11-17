//prem deshmukh


#include<reg51.h>

void MSDelay(unsigned int itime){
    
 unsigned int i,j;
for(i=0;i<itime;i++){

for(j=0;j<1275;j++){

}
}	
}

void main(){

while(1){
  P1=0xff;
	MSDelay(500);
	P1=0x00;
	MSDelay(500);
}


}