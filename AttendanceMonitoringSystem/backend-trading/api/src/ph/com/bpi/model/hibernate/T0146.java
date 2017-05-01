package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0146 {

private int id;
private BigDecimal phpLmit1;
private BigDecimal usdLmit1;
private BigDecimal ovrdPtt1;
private BigDecimal ofcr1Typ1;
private BigDecimal ofcr2Typ1;
private BigDecimal phpLmit2;
private BigDecimal usdLmit2;
private BigDecimal ovrdPtt2;
private BigDecimal ofcr1Typ2;
private BigDecimal ofcr2Typ2;
private BigDecimal phpLmit3;
private BigDecimal usdLmit3;
private BigDecimal ovrdPtt3;
private BigDecimal ofcr1Typ3;
private BigDecimal ofcr2Typ3;
private BigDecimal phpLmit4;
private BigDecimal usdLmit4;
private BigDecimal ovrdPtt4;
private BigDecimal ofcr1Typ4;
private BigDecimal ofcr2Typ4;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public BigDecimal getPhpLmit1() {
	return phpLmit1;
}

public void setPhpLmit1(BigDecimal phpLmit1) {
	this.phpLmit1 = phpLmit1;
}

public BigDecimal getUsdLmit1() {
	return usdLmit1;
}

public void setUsdLmit1(BigDecimal usdLmit1) {
	this.usdLmit1 = usdLmit1;
}

public BigDecimal getOvrdPtt1() {
	return ovrdPtt1;
}

public void setOvrdPtt1(BigDecimal ovrdPtt1) {
	this.ovrdPtt1 = ovrdPtt1;
}

public BigDecimal getOfcr1Typ1() {
	return ofcr1Typ1;
}

public void setOfcr1Typ1(BigDecimal ofcr1Typ1) {
	this.ofcr1Typ1 = ofcr1Typ1;
}

public BigDecimal getOfcr2Typ1() {
	return ofcr2Typ1;
}

public void setOfcr2Typ1(BigDecimal ofcr2Typ1) {
	this.ofcr2Typ1 = ofcr2Typ1;
}

public BigDecimal getPhpLmit2() {
	return phpLmit2;
}

public void setPhpLmit2(BigDecimal phpLmit2) {
	this.phpLmit2 = phpLmit2;
}

public BigDecimal getUsdLmit2() {
	return usdLmit2;
}

public void setUsdLmit2(BigDecimal usdLmit2) {
	this.usdLmit2 = usdLmit2;
}

public BigDecimal getOvrdPtt2() {
	return ovrdPtt2;
}

public void setOvrdPtt2(BigDecimal ovrdPtt2) {
	this.ovrdPtt2 = ovrdPtt2;
}

public BigDecimal getOfcr1Typ2() {
	return ofcr1Typ2;
}

public void setOfcr1Typ2(BigDecimal ofcr1Typ2) {
	this.ofcr1Typ2 = ofcr1Typ2;
}

public BigDecimal getOfcr2Typ2() {
	return ofcr2Typ2;
}

public void setOfcr2Typ2(BigDecimal ofcr2Typ2) {
	this.ofcr2Typ2 = ofcr2Typ2;
}

public BigDecimal getPhpLmit3() {
	return phpLmit3;
}

public void setPhpLmit3(BigDecimal phpLmit3) {
	this.phpLmit3 = phpLmit3;
}

public BigDecimal getUsdLmit3() {
	return usdLmit3;
}

public void setUsdLmit3(BigDecimal usdLmit3) {
	this.usdLmit3 = usdLmit3;
}

public BigDecimal getOvrdPtt3() {
	return ovrdPtt3;
}

public void setOvrdPtt3(BigDecimal ovrdPtt3) {
	this.ovrdPtt3 = ovrdPtt3;
}

public BigDecimal getOfcr1Typ3() {
	return ofcr1Typ3;
}

public void setOfcr1Typ3(BigDecimal ofcr1Typ3) {
	this.ofcr1Typ3 = ofcr1Typ3;
}

public BigDecimal getOfcr2Typ3() {
	return ofcr2Typ3;
}

public void setOfcr2Typ3(BigDecimal ofcr2Typ3) {
	this.ofcr2Typ3 = ofcr2Typ3;
}

public BigDecimal getPhpLmit4() {
	return phpLmit4;
}

public void setPhpLmit4(BigDecimal phpLmit4) {
	this.phpLmit4 = phpLmit4;
}

public BigDecimal getUsdLmit4() {
	return usdLmit4;
}

public void setUsdLmit4(BigDecimal usdLmit4) {
	this.usdLmit4 = usdLmit4;
}

public BigDecimal getOvrdPtt4() {
	return ovrdPtt4;
}

public void setOvrdPtt4(BigDecimal ovrdPtt4) {
	this.ovrdPtt4 = ovrdPtt4;
}

public BigDecimal getOfcr1Typ4() {
	return ofcr1Typ4;
}

public void setOfcr1Typ4(BigDecimal ofcr1Typ4) {
	this.ofcr1Typ4 = ofcr1Typ4;
}

public BigDecimal getOfcr2Typ4() {
	return ofcr2Typ4;
}

public void setOfcr2Typ4(BigDecimal ofcr2Typ4) {
	this.ofcr2Typ4 = ofcr2Typ4;
}

public void parse(HashMap<String, String> map){

	for(String key: map.keySet()){
		switch(key){
			case "PHP_LMIT1":
				phpLmit1 = new BigDecimal(map.get(key));
				break;
			case "PHP_LMIT2":
				System.out.print(map.get(key) + " KE KE KEK KEK EK KEKE KEKE");
				phpLmit2 = new BigDecimal(map.get(key));
				break;

			case "PHP_LMIT3":
				phpLmit3 = new BigDecimal(map.get(key));
				break;
			case "PHP_LMIT4":
				phpLmit4 = new BigDecimal(map.get(key));
				break;
			case "USD_LMIT1":
				usdLmit1=new BigDecimal(map.get(key));
				break;
			case "USD_LMIT2":
				usdLmit2=new BigDecimal(map.get(key));
				break;
			case "USD_LMIT4":
				usdLmit3=new BigDecimal(map.get(key));
				break;
			case "USD_LMIT3":
				usdLmit3=new BigDecimal(map.get(key));
				break;

			case "OVERD_PTT1":
				ovrdPtt1=new BigDecimal(map.get(key));
				break;
			case "OVERD_PTT3":
				ovrdPtt3=new BigDecimal(map.get(key));
				break;
			case "OVERD_PTT4":
				ovrdPtt4=new BigDecimal(map.get(key));
				break;
			case "OVERD_PTT2":
				ovrdPtt2=new BigDecimal(map.get(key));
				break;
			case "OFCR1_TYP1":
				ofcr1Typ1=new BigDecimal(map.get(key));
				break;
			case "OFCR2_TYP1":
				ofcr2Typ1=new BigDecimal(map.get(key));
				break;
			case "OFCR1_TYP2":
				ofcr1Typ2=new BigDecimal(map.get(key));
				break;
			case "OFCR2_TYP2":
				ofcr2Typ2=new BigDecimal(map.get(key));
				break;
			case "OFCR1_TYP3":
				ofcr1Typ3=new BigDecimal(map.get(key));
				break;
			case "OFCR2_TYP3":
				ofcr2Typ3=new BigDecimal(map.get(key));
				break;
			case "OFCR1_TYP4":
				ofcr1Typ4=new BigDecimal(map.get(key));
				break;
			case "OFCR2_TYP4":
				ofcr2Typ4=new BigDecimal(map.get(key));
				break;
		}
	}
}
}