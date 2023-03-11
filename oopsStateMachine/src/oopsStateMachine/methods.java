package oopsStateMachine;

public class methods {
	base b = new base();
	int val1;
	int val2;
	int val3;
	int val4;
	int val5;

	// TestATM t=new TestATM();
	public int denomi100(int amount1, int denomination100) {
		if (denomination100 < b.getD100()) {
			val1 = denomination100 * 100;

			b.setD100(b.getD100()-denomination100);
		}

			if (amount1 == val1) {
				//b.setD100(b.getD100() - denomination100);
				return amount1;
			} else
				return val1;
	
	}

	public int denomi50(int val1, int denomination50) {
		if (denomination50 < b.getD50()) {
			val2 = denomination50 * 50;
			b.setD50(b.getD50() - denomination50);
			
		}
//			if (val1 > val2) {
//				//b.setD50(b.getD50() - denomination50);
//				return val2;
//			}
//			else
				//System.out.println(val1);
			
				return val1+val2;
		
		
	}

	

	public int denomi20(int val2, int denomination20) {
		if (denomination20 < b.getD20()) {
			val3 = denomination20 * 20;
			b.setD20(b.getD20()-denomination20);
		
		}
//			if (val2 < val3) {
//				//b.setD20(b.getD20() - denomination20);
//				return val3;
//			} 
//			else
				return (val2+val3);
		
		//b.setD10(b.getD20()-denomination20);
	}

	public int denomi10(int val3, int denomination10) {
		if (denomination10 < b.getD10()) {
			val4 = denomination10 * 10;
			b.setD10(b.getD10() - denomination10);
		}
//			if (val3 < val4) {
//				//b.setD20(b.getD20() - denomination10);
//				return val3;
			//} else
				return (val3+val4);
		

		
	}

	public int denomi5(int val4, int denomination5) {
		if (denomination5 < b.getD5()) {
			val5 = denomination5 * 5;
			b.setD5(b.getD5() - denomination5);
			
		}
//			if (val4 < val5) {
//				//b.setD20(b.getD20() - denomination20);
//				return val5;
//			} else
				return (val4+val5);
		

		
		}
	}

