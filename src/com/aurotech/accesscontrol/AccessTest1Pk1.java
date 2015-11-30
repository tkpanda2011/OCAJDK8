package com.aurotech.accesscontrol;

public class AccessTest1Pk1 {
private String priVar;
protected String protVar;
public String pubVar;
public static int staticVar=10;
String defVar;
public String getPriVar() {
	return priVar;
}
public void setPriVar(String priVar) {
	this.priVar = priVar;
}
public String getProtVar() {
	return protVar;
}
public void setProtVar(String protVar) {
	this.protVar = protVar;
}
public String getPubVar() {
	return pubVar;
}
public void setPubVar(String pubVar) {
	this.pubVar = pubVar;
}
public AccessTest1Pk1(String priVar, String protVar, String pubVar) {
	
	this.priVar = priVar;
	this.protVar = protVar;
	this.pubVar = pubVar;
}
public String getDefVar() {
	return defVar;
}
public void setDefVar(String defVar) {
	this.defVar = defVar;
}


}
