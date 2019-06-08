package com.wbl.testcases22;

public class CompareArray {
	
		public boolean compArray(int[] a,int[] b) {
			boolean bool =true;
			if(a.length==b.length) {
				for(int i=0;i<b.length;++i) {
					if(b[i] != a[i]) {
						bool=false;
					}
				}
			}
			else {
				bool=false;
			}
			return bool;
			}
		
		}


