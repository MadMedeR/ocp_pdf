package fragen_July_2018;

public class _180 {}

interface Exportable{
	void export();
}

class Tool implements Exportable{
	protected void export() {					// line n1  
		System.out.println("Tool::export");
	}
}

class ReportTool extends Tool implements Exportable {
	public void export() {						// line n2
		System.out.println("RTool::export");
	}
	
	public static void main(String[] args) {
		Tool aTool= new ReportTool();
		Tool bTool= new Tool();
		callExport(aTool);
		callExport(bTool);
	}
	
	public static void callExport(Exportable ex) {
		ex.export();
	}
}

/*
	What is the result?
	
	A. Compilation fails at both line n1 and line n2
	B. Compilation fails only at line n1
	C. Compilation fails only at line n2
	D. Too1 :: export Too1 :: export
	E. RToo1 :: export Too1 :: export

	Antwort: B
*/