#include<bits/stdc++.h>
using namespace std;

string start =" ";

// input file name wiki 
// output file name convert.txt

int main()
{
	char ch;
	ofstream myfile;
	myfile.open("convert.txt");
    fstream fin("wiki", fstream::in);

    while (fin >> noskipws >> ch) 
    {
    	if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9'))
    	{
    	  
    	  start+=ch;	
    	}
    	else if(ch=='\n')
    	{
           
           start+='\n';
    	}
    	else
    	{
    		
    		start+=' ';
    	}
    	
    }

    start+=' ';

    for(int i=1;i<start.length();i++)
    {
    	if(start[i]==' ' && start[i+1]==' ')
    	{
    		myfile<<" ";
    	}
    	else if(start[i]==' ' && start[i-1]==' ')
    	{
           continue;
    	}
    	else
    	{
    		myfile<<start[i];
    	}
    }

    myfile.close();

	return 0;
}