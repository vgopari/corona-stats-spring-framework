package com.vamshi.springdemo.controller;

import java.util.LinkedHashMap;

public class Corona {

	private String country;

	private LinkedHashMap<String, String> countryOptions;

	public Corona() {

		countryOptions = new LinkedHashMap<>();

		countryOptions.put("afghanistan","Afghanistan");
		countryOptions.put("albania","Albania");
		countryOptions.put("algeria","Algeria");
		countryOptions.put("andorra","Andorra");
		countryOptions.put("angola","Angola");
		countryOptions.put("anguilla","Anguilla");
		countryOptions.put("antigua-and-barbuda","Antigua & Barbuda");
		countryOptions.put("argentina","Argentina");
		countryOptions.put("armenia","Armenia");
		countryOptions.put("aruba","Aruba");
		countryOptions.put("australia","Australia");
		countryOptions.put("austria","Austria");
		countryOptions.put("azerbaijan","Azerbaijan");
		countryOptions.put("bahamas","bahamas");
		countryOptions.put("bahrain","Bahrain");
		countryOptions.put("bangladesh","bangladesh");
		countryOptions.put("barbados","barbados");
		countryOptions.put("belarus","belarus");
		countryOptions.put("belgium","belgium");
		countryOptions.put("belize","belize");
		countryOptions.put("benin","benin");
		countryOptions.put("bermuda","bermuda");
		countryOptions.put("bhutan","bhutan");
		countryOptions.put("bolivia","bolivia");
		countryOptions.put("bosnia-and-herzegovina","Bosnia & Herzegovina");
		countryOptions.put("botswana","botswana");
		countryOptions.put("brazil","brazil");
		countryOptions.put("british-virgin-islands","British-Virgin-Islands");
		countryOptions.put("brunei-darussalam","Brunei Darussalam");
		countryOptions.put("bulgaria","bulgaria");
		countryOptions.put("burkina-faso","Burkina Faso");
		countryOptions.put("burundi","burundi");
		countryOptions.put("cabo-verde","Cabo Verde");
		countryOptions.put("cambodia","Cambodia");
		countryOptions.put("cameroon","Cameroon");
		countryOptions.put("canada","Canada");
		countryOptions.put("caribbean-netherlands","caribbean-netherlands");
		countryOptions.put("cayman-islands","Cayman Islands");
		countryOptions.put("central-african-republic","central-african-republic");
		countryOptions.put("chad","chad");
		countryOptions.put("channel-islands","channel-islands");
		countryOptions.put("chile","chile");
		countryOptions.put("china","china");
		countryOptions.put("china-hong-kong-sar","china hong kong");
		countryOptions.put("china-macao-sar","china macao sar");
		countryOptions.put("colombia","Colombia");
		countryOptions.put("congo","Congo");
		countryOptions.put("costa-rica","Costa Rica");
		countryOptions.put("cote-d-ivoire","Cote DIvoire");
		countryOptions.put("croatia","Corotia");
		countryOptions.put("cuba","Cuba");
		countryOptions.put("curacao","Curacao");
		countryOptions.put("cyprus","Cyprus");
		countryOptions.put("czech-republic","Czech Republic");
		countryOptions.put("democratic-republic-of-the-congo","Democratic Replubic of Congo");
		countryOptions.put("denmark","Denmark");
		countryOptions.put("djibouti","Djibouti");
		countryOptions.put("dominica","Dominica");
		countryOptions.put("dominican-republic","Dominican Republic");
		countryOptions.put("ecuador","Ecuador");
		countryOptions.put("egypt","Egypt");
		countryOptions.put("el-salvador","El Salvador");
		countryOptions.put("equatorial-guinea","Equatorial Guinea");
		countryOptions.put("eritrea","Eritrea");
		countryOptions.put("estonia","Estonia");
		countryOptions.put("ethiopia","Ethiopia");
		countryOptions.put("faeroe-islands","Faeroe Islands");
		countryOptions.put("falkland-islands-malvins","Falkland Islands malvin");
		countryOptions.put("fiji","Fiji");
		countryOptions.put("finland","Finland");
		countryOptions.put("france","France");
		countryOptions.put("french-guiana","French Guiana");
		countryOptions.put("french-polynesia","French Polynesia");
		countryOptions.put("gabon","Gabon");
		countryOptions.put("gambia","Gambia");
		countryOptions.put("georgia","Georgia");
		countryOptions.put("germany","Germany");
		countryOptions.put("ghana","Ghana");
		countryOptions.put("gibraltar","Gibraltar");
		countryOptions.put("greece","Greece");
		countryOptions.put("greenland","Greenland");
		countryOptions.put("grenada","Grenada");
		countryOptions.put("guadeloupe","Guadeloupe");
		countryOptions.put("guatemala","Guatemala");
		countryOptions.put("guinea","Guinea");
		countryOptions.put("guinea-bissau","Guinea Bissau");
		countryOptions.put("guyana","Guyana");
		countryOptions.put("haiti","Haiti");
		countryOptions.put("honduras","Honduras");
		countryOptions.put("hungary","Hungary");
		countryOptions.put("iceland","Iceland");
		countryOptions.put("indonesia","Indonesia");
		countryOptions.put("india","India");
		countryOptions.put("iran","Iran");
		countryOptions.put("iraq","Iraq");
		countryOptions.put("ireland","Ireland");
		countryOptions.put("isle-of-man","Isle of Man");
		countryOptions.put("israel","Israel");
		countryOptions.put("italy","Italy");
		countryOptions.put("jamica","Jamaica");
		countryOptions.put("japan","Japan");
		countryOptions.put("jordan","Jordan");
		countryOptions.put("kazakhstan","Kazakhstan");
		countryOptions.put("kenya","Kenya");
		countryOptions.put("kuwait","Kuwait");
		countryOptions.put("kyrgyzstan","Kyrgyzstan");
		countryOptions.put("laos","Laos");
		countryOptions.put("latvia","Latvia");
		countryOptions.put("lebanon","Lebanon");
		countryOptions.put("liberia","Liberia");
		countryOptions.put("libya","Libya");
		countryOptions.put("liechtenstein","Liechtenstein");
		countryOptions.put("lithuania","Lithuania");
		countryOptions.put("luxembourg","Luxembourg");
		countryOptions.put("macedonia","Macedonia");
		countryOptions.put("madagascar","Madagascar");
		countryOptions.put("malaysia","Malaysia");
		countryOptions.put("malawi","Malawi");
		countryOptions.put("maldives","Maldives");
		countryOptions.put("mali","Mali");
		countryOptions.put("malta","Malta");
		countryOptions.put("martinique","Martinique");
		countryOptions.put("mauritania","Mauritania");
		countryOptions.put("mauritius","Mauritius");
		countryOptions.put("mayotte","Mayotte");
		countryOptions.put("mexico","Mexico");
		countryOptions.put("moldova","Moldova");
		countryOptions.put("monaco","Monaco");
		countryOptions.put("mongolia","Mongolia");
		countryOptions.put("montenegro","Montenegro");
		countryOptions.put("montserrat","Montserrat");
		countryOptions.put("morocco","Morocco");
		countryOptions.put("mozambique","Mozambique");
		countryOptions.put("myanmar","Myanmar");
		countryOptions.put("namibia","Namibia");
		countryOptions.put("nepal","Nepal");
		countryOptions.put("netherlands","Netherlands");
		countryOptions.put("new-caledonia","New caledonia");
		countryOptions.put("new-zealand","New zealand");
		countryOptions.put("nicaragua","Nicaragua");
		countryOptions.put("niger","Niger");
		countryOptions.put("nigeria","Nigeria");
		countryOptions.put("norway","Norway");
		countryOptions.put("oman","Oman");
		countryOptions.put("pakistan","Pakistan");
		countryOptions.put("panama","Panama");
		countryOptions.put("papua-new-guinea","Papua new Guinea");
		countryOptions.put("paraguay","Paraguay");
		countryOptions.put("peru","Peru");
		countryOptions.put("philippines","Phillipines");
		countryOptions.put("poland","Poland");
		countryOptions.put("portugal","Portugal");
		countryOptions.put("qatar","Qatar");
		countryOptions.put("reunion","Reunion");
		countryOptions.put("romania","Romania");
		countryOptions.put("russia","Russia");
		countryOptions.put("rwanda","Rwanda");
		countryOptions.put("saint-barthelemy","St Barthelemy");
		countryOptions.put("saint-kitts-and-nevis","St Kitts-Nevis");
		countryOptions.put("saint-lucia","St Lucia");
		countryOptions.put("saint-martin","Saint Martin");
		countryOptions.put("saint-vincent-and-the-grenadines","St Vincent and grenadines");
		countryOptions.put("san-marino","San Marino");
		countryOptions.put("saudi-arabia","Saudi Arabia");
		countryOptions.put("senegal","Senegal");
		countryOptions.put("serbia","Serbia");
		countryOptions.put("seychelles","Seychelles");
		countryOptions.put("sierra-leone","Sierra Leone");
		countryOptions.put("singapore","Singapore");
		countryOptions.put("sint-maarten","Sint Marteen");
		countryOptions.put("slovakia","Slovakia");
		countryOptions.put("slovenia","Slovenia");
		countryOptions.put("somalia","Somalia");
		countryOptions.put("south-africa","South Africa");
		countryOptions.put("south-korea","South Korea");
		countryOptions.put("spain","Spain");
		countryOptions.put("sri-lanka","SriLanka");
		countryOptions.put("state-of-palestine","State of Palestine");
		countryOptions.put("sudan","Sudan");
		countryOptions.put("suriname","Suriname");
		countryOptions.put("swaziland","Swaziland");
		countryOptions.put("sweden","Sweden");
		countryOptions.put("switzerland","Switzerland");
		countryOptions.put("syria","Syria");
		countryOptions.put("taiwan","Taiwan");
		countryOptions.put("tanzania","Tanzania");
		countryOptions.put("thailand","Thailand");
		countryOptions.put("timor-leste","Timor leste");
		countryOptions.put("togo","Togo");
		countryOptions.put("trinidad-and-tabago","Trinidad & tobago");
		countryOptions.put("tunisia","Tunisia");
		countryOptions.put("turkey","Turkey");
		countryOptions.put("turks-and-caicos-islands","Turks & Caicos Island");
		countryOptions.put("uganda","Uganda");
		countryOptions.put("uk","United Kingdom");
		countryOptions.put("ukraine","Ukraine");
		countryOptions.put("united-arab-emirates","United Arab Emirates");
		countryOptions.put("us","United States of America");
		countryOptions.put("uruguay","Uruguay");
		countryOptions.put("uzbekistan","Uzbekistan");
		countryOptions.put("holy-see","Vatican City");
		countryOptions.put("venezuela","Venezuela");
		countryOptions.put("viet-nam","Vietnam");
		countryOptions.put("zambia","Zambia");
		countryOptions.put("zimbabwe","Zimbabwe");

	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	
	

}
