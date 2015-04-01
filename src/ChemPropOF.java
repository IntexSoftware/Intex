import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class ChemPropOF {
	
	private String nameOF;
	
	public void setName(String name){this.nameOF = name;}

	public ChemPropOF() throws IOException, UnsupportedEncodingException 
	{
		
		// create setters
		
		PrintWriter writer = new PrintWriter("/home/mz/chemistryProperties", "UTF-8");
		
		writer.println(""+ nameOF +"																		");
		writer.println("{																				");
		writer.println("	version     2.0;															");
		writer.println("	format      binary;															");
		writer.println("	class       dictionary;														");
		writer.println("	location    \"constant\";													");
		writer.println("	object      chemistryProperties;											");
		writer.println("}																				");
		writer.println("// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * // ");
		writer.println("");
		writer.println("ePsiChemistryModel  ODEChemistryModel<gasThermoPhysics>;						");
		writer.println("hPsiChemistryModel  ODEChemistryModel<gasThermoPhysics>; // for pressure based solver");
		writer.println("");
		writer.println("chemistry           on;															");
		writer.println("");
		writer.println("chemistrySolver     ode;														");
		writer.println("");
		writer.println("initialChemicalTimeStep 4e-7;													");
		writer.println("");
		writer.println("sequentialCoeffs																");
		writer.println("{																				");
		writer.println("    cTauChem        0.001;														");
		writer.println("}																				");
		writer.println("");
		writer.println("EulerImplicitCoeffs");
		writer.println("{");
		writer.println("	cTauChem        0.05;");
		writer.println("    equilibriumRateLimiter off;");
		writer.println("}");
		writer.println("");
		writer.println("odeCoeffs");
		writer.println("{");
		writer.println("    ODESolver       KRR4;");
		writer.println("    eps             1e-2;");
		writer.println("    scale           1;");
		writer.println("}");
		writer.println("");
		writer.println("// ************************************************************************* //");
		writer.println("");
		writer.println("turbulentBurning	on;");
		writer.println("quenching 		on;");
		writer.println("autoIgnitionTauModel    on;");
		writer.println("    ");
		writer.println("ignRelax		1.0;");
		writer.println("Tfactor			1.0;");
		writer.println("reconstructionStages    1;");
		writer.println("");
		writer.println("tfcDict");
		writer.println("{");
		writer.println("    tfcModel            bXi;");
		writer.println("    pressureCorrection  on;");
		writer.println(" ");
		writer.println(" ");
		writer.println("");
		writer.println("    // bXi");
		writer.println("    sLCorrelation	Ettner; // Ettner, Ardey");
		writer.println("    XiModel             algebraic; // fixed, algebraic, transport");
		writer.println("    XiCoef              XiCoef [ 0 0 0 0 0 0 0 ] 0.62;");
		writer.println("    XiShapeCoef         XiShapeCoef [ 0 0 0 0 0 0 0 ] 1;");
		writer.println("    uPrimeCoef          uPrimeCoef [ 0 0 0 0 0 0 0 ] 1;");
		writer.println("");
		writer.println("    yO2inAir            0.23295;");
		writer.println("}");
		writer.println("");
		writer.println("// ************************************************************************** // ");

		writer.close();
	}

}
