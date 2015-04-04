import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class GeomAndMesh 
{
	
	private String cName;
	private String directoryPy;
	private String xD;
	private String yD;
	private String zD;
	private String mSize;
	private String meshType;
	
	public GeomAndMesh(){}
	
	//Setters
	public void setCaseName(String nameC)	{this.cName = nameC;}
	public void setDirectory(String nameD){this.directoryPy = nameD;}
	public void setXDirection(String x){this.xD = x;}
	public void setYDirection(String y){this.yD = y;}
	public void setZDirection(String z){this.zD = z;}
	public void setMeshSize(String cvSize){this.mSize = cvSize;}
	public void setMeshType(String mType){this.meshType = mType;}
	
	
	public void createPyForSalome() throws FileNotFoundException, UnsupportedEncodingException
	{
		PrintWriter writer = new PrintWriter(""+directoryPy+"/GeomAndMesh.py", "UTF-8");
		
		writer.println("# -*- coding: iso-8859-1 -*-                      ");

		writer.println("###");
		writer.println("### This file is generated automatically by SALOME v6.6.0 with dump python functionality");
		writer.println("###");

		writer.println("import sys");
		writer.println("import salome");

		writer.println("salome.salome_init()");
		writer.println("theStudy = salome.myStudy");

		writer.println("import salome_notebook");
		writer.println("notebook = salome_notebook.notebook");
		writer.println("sys.path.insert( 0, r'"+directoryPy+"')");

		writer.println("###");
		writer.println("### GEOM component");
		writer.println("###");

		writer.println("import GEOM");
		writer.println("import geompy");
		writer.println("import math");
		writer.println("import SALOMEDS");

		writer.println("geompy.init_geom(theStudy)");

		writer.println("O = geompy.MakeVertex(0, 0, 0)");
		writer.println("OX = geompy.MakeVectorDXDYDZ(1, 0, 0)");
		writer.println("OY = geompy.MakeVectorDXDYDZ(0, 1, 0)");
		writer.println("OZ = geompy.MakeVectorDXDYDZ(0, 0, 1)");
		writer.println("Box_1 = geompy.MakeBoxDXDYDZ("+xD+", "+yD+", "+zD+")");
		writer.println("right = geompy.CreateGroup(Box_1, geompy.ShapeType[\"FACE\"])");
		writer.println("geompy.UnionIDs(right, [33])");
		writer.println("left = geompy.CreateGroup(Box_1, geompy.ShapeType[\"FACE\"])");
		writer.println("geompy.UnionIDs(left, [31])");
		writer.println("top = geompy.CreateGroup(Box_1, geompy.ShapeType[\"FACE\"])");
		writer.println("geompy.UnionIDs(top, [27])");
		writer.println("bottom = geompy.CreateGroup(Box_1, geompy.ShapeType[\"FACE\"])");
		writer.println("geompy.UnionIDs(bottom, [23])");
		writer.println("start = geompy.CreateGroup(Box_1, geompy.ShapeType[\"FACE\"])");
		writer.println("geompy.UnionIDs(start, [3])");
		writer.println("end = geompy.CreateGroup(Box_1, geompy.ShapeType[\"FACE\"])");
		writer.println("geompy.UnionIDs(end, [13])");
		writer.println("geompy.addToStudy( O, 'O' )");
		writer.println("geompy.addToStudy( OX, 'OX' )");
		writer.println("geompy.addToStudy( OY, 'OY' )");
		writer.println("geompy.addToStudy( OZ, 'OZ' )");
		writer.println("geompy.addToStudy( Box_1, 'Box_1' )");
		writer.println("geompy.addToStudyInFather( Box_1, right, 'right' )");
		writer.println("geompy.addToStudyInFather( Box_1, left, 'left' )");
		writer.println("geompy.addToStudyInFather( Box_1, top, 'top' )");
		writer.println("geompy.addToStudyInFather( Box_1, bottom, 'bottom' )");
		writer.println("geompy.addToStudyInFather( Box_1, start, 'start' )");
		writer.println("geompy.addToStudyInFather( Box_1, end, 'end' )");

		writer.println("###");
		writer.println("### SMESH component");
		writer.println("###");

		writer.println("import smesh, SMESH, SALOMEDS");

		writer.println("smesh.SetCurrentStudy(theStudy)");
		writer.println("import StdMeshers");
		writer.println("Mesh_1 = smesh.Mesh(Box_1)");
		writer.println("Regular_1D = Mesh_1.Segment()");
		writer.println("Max_Size_1 = Regular_1D.MaxSize("+mSize+")");
		writer.println("Quadrangle_2D = Mesh_1.Quadrangle(algo=smesh.QUADRANGLE)");
		writer.println("Hexa_3D = Mesh_1.Hexahedron(algo=smesh.Hexa)");
		writer.println("isDone = Mesh_1.Compute()");
		writer.println("Mesh_1.ExportUNV( r'"+directoryPy+"/Mesh_2.unv' )");
		writer.println("right_1 = Mesh_1.GroupOnGeom(right,'right',SMESH.FACE)");
		writer.println("left_1 = Mesh_1.GroupOnGeom(left,'left',SMESH.FACE)");
		writer.println("top_1 = Mesh_1.GroupOnGeom(top,'top',SMESH.FACE)");
		writer.println("bottom_1 = Mesh_1.GroupOnGeom(bottom,'bottom',SMESH.FACE)");
		writer.println("start_1 = Mesh_1.GroupOnGeom(start,'start',SMESH.FACE)");
		writer.println("end_1 = Mesh_1.GroupOnGeom(end,'end',SMESH.FACE)");
		writer.println("Mesh_1.ExportUNV( r'"+directoryPy+"/Mesh_2.unv' )");

		writer.println("## set object names");
		writer.println("smesh.SetName(Mesh_1.GetMesh(), 'Mesh_1')");
		writer.println("smesh.SetName(Regular_1D.GetAlgorithm(), 'Regular_1D')");
		writer.println("smesh.SetName(Max_Size_1, 'Max Size_1')");
		writer.println("smesh.SetName(Quadrangle_2D.GetAlgorithm(), 'Quadrangle_2D')");
		writer.println("smesh.SetName(Hexa_3D.GetAlgorithm(), 'Hexa_3D')");
		writer.println("smesh.SetName(right_1, 'right')");
		writer.println("smesh.SetName(left_1, 'left')");
		writer.println("smesh.SetName(top_1, 'top')");
		writer.println("smesh.SetName(bottom_1, 'bottom')");
		writer.println("smesh.SetName(start_1, 'start')");
		writer.println("smesh.SetName(end_1, 'end')");

		writer.println("# Save the Study");
		writer.println("salome.myStudyManager.SaveAs('"+directoryPy+"/study.hdf', salome.myStudy, False)");

		writer.println("# Close the Study");
		writer.println("salome.myStudyManager.Close(salome.myStudy)");
		writer.close();
	}


}
