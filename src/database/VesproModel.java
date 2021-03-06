package database;

public class VesproModel {

	private long id;
	private String imo_number;
	private String vessel_name;
	private String vessel_type;
	private String sr_certificate_no;
	private String agency_code;
	private String owner_name;
	private String owner_email;
	private String port_of_submission;
	private String nationality;
	private String vessel_height;
	private String vessel_breadth;
	private String vessel_length;
	private String vessel_weight;
	private String insurance_company;
	private String insurance_validity;
	private String pni_club;
	private String pni_insurance_validity;
	private String vessel_gears;
	private String engine_type;
	private int no_engines;
	
	public static final String TABLE_TPCS_VESSEL = "TPCS_VESSEl";
	
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_IMO_NUMBER = "imo_number";
	public static final String COLUMN_VESSEL_NAME="vessel_name";
	public static final String COLUMN_VESSEL_TYPE="vessel_type";
	public static final String COLUMN_SR_CERTIFICATE_NO="sr_certificate_no";
	public static final String COLUMN_AGENCY_CODE = "agency_code";
	public static final String COLUMN_OWNER_NAME="owner_name";
	public static final String COLUMN_OWNER_EMAIL="owner_email";
	public static final String COLUMN_PORT_OF_SUBMISSION="port_of_submission";
	public static final String COLUMN_NATIONALITY="nationality";
	public static final String COLUMN_VESSEL_HEIGHT="vessel_height";
	public static final String COLUMN_VESSEL_BREADTH="vessel_breadth";
	public static final String COLUMN_VESSEL_LENGTH="vessel_length";
	public static final String COLUMN_VESSEL_WEIGHT="vessel_weight";
	public static final String COLUMN_INSURANCE_COMPANY="insurance_company";
	public static final String COLUMN_INSURANCE_VALIDITY="insurance_validity";
	public static final String COLUMN_PNI_CLUB = "pni_club";
	public static final String COLUMN_PNI_INSURANCE_VALIDITY ="pni_insurance_validity";
	public static final String COLUMN_VESSEL_GEARS="vessel_gears";
	public static final String COLUMN_ENGINE_TYPE="engine_type";
	public static final String COLUMN_NO_ENGINES="no_engines";
	
	public static final String  CREATE_TABLE_TPCS_VESSEL = "create table " + TABLE_TPCS_VESSEL + "("+ 
			       COLUMN_ID + " integer primary key autoincrement, " +
			       COLUMN_IMO_NUMBER +" text not null, " +
			       COLUMN_VESSEL_NAME + " text not null, " +
			       COLUMN_VESSEL_TYPE +  " text not null, " +
			       COLUMN_SR_CERTIFICATE_NO +" text not null," +
			       COLUMN_AGENCY_CODE + " text not null, " +
			       COLUMN_OWNER_NAME + " text not null, " +
			       COLUMN_OWNER_EMAIL + " text not null, " +
			       COLUMN_PORT_OF_SUBMISSION + " text not null, " +
			       COLUMN_NATIONALITY+ " text not null, " +
			       COLUMN_VESSEL_HEIGHT + " text not null, " +
			       COLUMN_VESSEL_BREADTH + " text not null, " +
			       COLUMN_VESSEL_LENGTH + " text not null, " +
			       COLUMN_VESSEL_WEIGHT + " text not null, " +
			       COLUMN_INSURANCE_COMPANY + " text not null, " +
			       COLUMN_INSURANCE_VALIDITY + " text not null, " +
			       COLUMN_PNI_CLUB + " text not null, " +
			       COLUMN_PNI_INSURANCE_VALIDITY + " text not null," +
			       COLUMN_VESSEL_GEARS + " text not null, " +
			       COLUMN_ENGINE_TYPE + " text not null, " +
				   COLUMN_NO_ENGINES + " integer not null);";

	/**
	 * @return the imo_number
	 */
	public String getImo_number() {
		return imo_number;
	}

	/**
	 * @param imo_number
	 *            the imo_number to set
	 */
	public void setImo_number(String imo_number) {
		this.imo_number = imo_number;
	}

	/**
	 * @return the vessel_name
	 */
	public String getVessel_name() {
		return vessel_name;
	}

	/**
	 * @param vessel_name
	 *            the vessel_name to set
	 */
	public void setVessel_name(String vessel_name) {
		this.vessel_name = vessel_name;
	}

	/**
	 * @return the vessel_type
	 */
	public String getVessel_type() {
		return vessel_type;
	}

	/**
	 * @param vessel_type
	 *            the vessel_type to set
	 */
	public void setVessel_type(String vessel_type) {
		this.vessel_type = vessel_type;
	}

	/**
	 * @return the sr_certificate_no
	 */
	public String getSr_certificate_no() {
		return sr_certificate_no;
	}

	/**
	 * @param sr_certificate_no
	 *            the sr_certificate_no to set
	 */
	public void setSr_certificate_no(String sr_certificate_no) {
		this.sr_certificate_no = sr_certificate_no;
	}

	/**
	 * @return the agency_code
	 */
	public String getAgency_code() {
		return agency_code;
	}

	/**
	 * @param agency_code
	 *            the agency_code to set
	 */
	public void setAgency_code(String agency_code) {
		this.agency_code = agency_code;
	}

	/**
	 * @return the owner_name
	 */
	public String getOwner_name() {
		return owner_name;
	}

	/**
	 * @param owner_name
	 *            the owner_name to set
	 */
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	/**
	 * @return the owner_email
	 */
	public String getOwner_email() {
		return owner_email;
	}

	/**
	 * @param owner_email
	 *            the owner_email to set
	 */
	public void setOwner_email(String owner_email) {
		this.owner_email = owner_email;
	}

	/**
	 * @return the port_of_submission
	 */
	public String getPort_of_submission() {
		return port_of_submission;
	}

	/**
	 * @param port_of_submission
	 *            the port_of_submission to set
	 */
	public void setPort_of_submission(String port_of_submission) {
		this.port_of_submission = port_of_submission;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * @param nationality
	 *            the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * @return the vessel_height
	 */
	public String getVessel_height() {
		return vessel_height;
	}

	/**
	 * @param vessel_height
	 *            the vessel_height to set
	 */
	public void setVessel_height(String vessel_height) {
		this.vessel_height = vessel_height;
	}

	/**
	 * @return the vessel_breadth
	 */
	public String getVessel_breadth() {
		return vessel_breadth;
	}

	/**
	 * @param vessel_breadth
	 *            the vessel_breadth to set
	 */
	public void setVessel_breadth(String vessel_breadth) {
		this.vessel_breadth = vessel_breadth;
	}

	/**
	 * @return the vessel_length
	 */
	public String getVessel_length() {
		return vessel_length;
	}

	/**
	 * @param vessel_length
	 *            the vessel_length to set
	 */
	public void setVessel_length(String vessel_length) {
		this.vessel_length = vessel_length;
	}

	/**
	 * @return the vessel_weight
	 */
	public String getVessel_weight() {
		return vessel_weight;
	}

	/**
	 * @param vessel_weight
	 *            the vessel_weight to set
	 */
	public void setVessel_weight(String vessel_weight) {
		this.vessel_weight = vessel_weight;
	}

	/**
	 * @return the insurance_company
	 */
	public String getInsurance_company() {
		return insurance_company;
	}

	/**
	 * @param insurance_company
	 *            the insurance_company to set
	 */
	public void setInsurance_company(String insurance_company) {
		this.insurance_company = insurance_company;
	}

	/**
	 * @return the insurance_validity
	 */
	public String getInsurance_validity() {
		return insurance_validity;
	}

	/**
	 * @param insurance_validity
	 *            the insurance_validity to set
	 */
	public void setInsurance_validity(String insurance_validity) {
		this.insurance_validity = insurance_validity;
	}

	/**
	 * @return the pni_club
	 */
	public String getPni_club() {
		return pni_club;
	}

	/**
	 * @param pni_club
	 *            the pni_club to set
	 */
	public void setPni_club(String pni_club) {
		this.pni_club = pni_club;
	}

	/**
	 * @return the pni_insurance_validity
	 */
	public String getPni_insurance_validity() {
		return pni_insurance_validity;
	}

	/**
	 * @param pni_insurance_validity
	 *            the pni_insurance_validity to set
	 */
	public void setPni_insurance_validity(String pni_insurance_validity) {
		this.pni_insurance_validity = pni_insurance_validity;
	}

	/**
	 * @return the vessel_gears
	 */
	public String getVessel_gears() {
		return vessel_gears;
	}

	/**
	 * @param vessel_gears
	 *            the vessel_gears to set
	 */
	public void setVessel_gears(String vessel_gears) {
		this.vessel_gears = vessel_gears;
	}

	/**
	 * @return the engine_type
	 */
	public String getEngine_type() {
		return engine_type;
	}

	/**
	 * @param engine_type
	 *            the engine_type to set
	 */
	public void setEngine_type(String engine_type) {
		this.engine_type = engine_type;
	}

	/**
	 * @return the no_engines
	 */
	public int getNo_engines() {
		return no_engines;
	}

	/**
	 * @param no_engines
	 *            the no_engines to set
	 */
	public void setNo_engines(int no_engines) {
		this.no_engines = no_engines;
	}

	// Will be used by the ArrayAdapter in the ListView
	@Override
	public String toString() {
		return id + " " + imo_number + " " + vessel_name + " " + vessel_type
				+ " " + sr_certificate_no + " " + agency_code + " "
				+ owner_name + " " + owner_email + " " + port_of_submission
				+ " " + nationality + " " + vessel_height + " "
				+ vessel_breadth + " " + vessel_length + " " + vessel_weight
				+ " " + insurance_company + " " + insurance_validity + " "
				+ pni_club + " " + pni_insurance_validity + " " + vessel_gears
				+ " " + engine_type + " " + no_engines;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
