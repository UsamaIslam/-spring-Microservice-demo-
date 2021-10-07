package com.utills;

public enum Status {

	OK (200, "Request completed successfully!"),
	ERROR,
	ACCEPT_TOKEN_INVALID(400, "Accept token is invalid"),
	PASSWORD_DOES_NOT_MEET_REQUIREMENT(400, "Password must be min 6, max 15 with atleast 1 special character"),
	PASSWORDS_DO_NOT_MATCH(400, "Passwords do not match"),
	OLD_PASSWORD_NEW_PASSWORD_MUST_NOT_MATCH(400, "New password must be different from previous password"),
	EXISTING_PASSWORD_INCORRECT(400, "The old password that you entered is incorrect"),
	EMAIL_FORMAT_INVALID(400, "Email address format is invalid"),
	USER_ID_MUST_BE_POSITIVE_INTEGER(400, "User id must be a positive integer"),
	FILE_NOT_IN_PDF_FORMAT(400, "File must be a PDF"),
	FILE_NOT_IN_IMG_FORMAT(400, "File must be an IMG file"),
	EMPTY_FILE(400, "File must not be empty"),
	EITHER_CAREGIVERID_OR_EMAIL_MUST_BE_PROVIDED(400, "Either caregiver id or email must be provided"),
	EITHER_user_OR_EMAIL_MUST_BE_PROVIDED(400, "Either user id or email must be provided"),

	MULTIPLE_RECORDS_FOUND(500, "More than 1 record found"),
	URL_INCORRECT(400, "The URL you are trying to access seems to be malformed. Please use the correct one."),

	INTERNAL_SERVER_ERROR(500, "Request not successful"),
	BAD_REQUEST(400, "Bad request"),
	ELEMENT_NOT_FOUND(404, "Element not found"),
	SUCCESSFULLY_REMOVED(200, "User has been successfully removed from the system"),
	SUCCESSFULLY_DETACHED(200, "Viewer has been successfully detached with this subject"),
	SESSION_EXPIRED(401, "Your session has expired. Please signin again"),
	LOGGED_OUT(200, "You have been logged out of the system"),
	UPLOAD_TO_AMAZON_S3_FAILED(503, "Upload to Amazon S3 failed"),

	AUTH_OK(200, "Authentication successful"),
	EMAIL_SENT(200, "A password reset link has been sent to the specified email address"),
	TOKEN_REFRESHED(200, "Token has been refreshed successfully!"),
	EMAIL_ADDRESS_MISSING(404, "Email address is missing"),
	PASSWORD_RESET_SUCCESSFUL(200,"Password has been reset successfully! You may now login with your new password"),
	SUCCESSFULLY_SIGNED_IN(200, "Authentication successful"),
	AUTH_MESSAGE_EXPIRED(401, "The authorisation token has expired. Kindly request for a new password reset link"),
	REGISTRATION_CONFIRMED(200, "Your account has been successfully registered"),
	DUPLICATE_USER(400, "A user is already associated with this email id"),
	SIGNUP_OK(200, "Your account has been created. We sent a verification link to your email address. Click on the link to activate your account"),
	SIGNUP_FAILED(400, "Signup Failed, Please try again later"),
	ADMIN_USER_DETAILS_UPDATED(200, "The user details have been updated successfully. A confirmation email has been sent to the user's new email address"),
	EMAIL_ACCOUNT_CONFIRMED(200, "Thank you for confirming your email account!"),
	TOKEN_NOT_EXISTS(400, "Token is invalid"),
	AUTH_TOKEN_INVALID(401, "Authorization token is invalid"),

	//USER_ADDED(201, "Welcome to Medometer"),
	USER_DETAILS_AND_AUTH_TOKEN_DO_NOT_MATCH(401, "The user details in the authoriation token are not valid"),
	USER_ID_MISSING(400, "User id is missing"),
	USER_NOT_EXISTS(404, "The specified user does not exist"),
	ASSOCIATED_USER_NOT_EXISTS(404, "The Associated user does not exist"),
	SAME_SCALE_EXISTS(404, "Same scale already exist"),

	SUBJECT_ID_ALREADY_ASSOCIATED(404, "The specified subject id already exists with this Viewer"),
	USER_IS_NOT_VIEWER(400, "This user is not a viewer"),
	USER_IS_NOT_SUBJECT(400, "This user is not a subject"),
	USER_NOT_ACTIVE(401, "The user account is currently not active"),
	USER_DETAILS_UPDATED(200, "User has been updated successfully"),
	USER_CREATED(200, "User has been Created successfully"),

	USER_ACTIVE(400, "The specified user is currently active. No reminder re sent"),
	USER_SIGNUP_EMAIL_RESENT(200, "A confirmation email has been re sent to the specified email address"),
	USER_PASSWORD_CHANGED_SUCCESSFULLY(200,"User password changed successfully"),
	USER_EMAIL_PASSWORD_INCORRECT(400, "Email/password is incorrect"),
	SUBJECT_ID_NOT_ZERO(400, "Please provide a valid Subject Id"),
	USER_EMAIL_ALREADY_VALIDATED(400, "You have already validated your email address, you can now login into the app."),
	USER_NOT_UPDATED_AS_NOT_ACTIVE(400, "User cannot be updated as it is currently inactive"),

	INVENSOR_ID_MISSING(400,"Invensor id is missing"),
	INVENSOR_ADDED(200, "Invensor has been added against the user"),
	INVENSOR_UPDATED(200, "Invensor details have been updated against the user"),
	INVENSOR_REMOVED(200, "The invensor has been removed successfully!"),
	INVALID_INVENSOR_ID(400, "Invensor id invalid"),
	INVENSOR_NOT_FOUND(404, "Invensor not found"),
	INVENSOR_USER_NOT_ASSOCIATED(404, "The specified invensor is not linked to the signed in user"),
	INVENSOR_DUPLICATE_NAME(400, "You have already added an invensor with this name, please try a different name"),
	INVENSOR_DUPLICATE_MACADDRESS(400, "This invensor is already associated with a different user, please choose another"),

	TEMPERATURE_ADDED(200,"Temperature has been successfully added against the specified user"),
	TEMPERATURE_NOT_FOUND_IN_RANGE(200, "No records found in the specified range"),
	LOCATION_NOT_FOUND(200, "No records found"),
	TEMPERATURES_NOT_FOUND_By_MACADDRESS(200, "No records found either MAC Address is invalid or does not exist for the specified user"),
	TEMPERATURE_START_TIME_MUST_BE_LESS_THAN_END_TIME(400, "'Start time' should not be greater than end time"),

	MEDICINE_ID_MISSING(400, "Medicine id is missing"),
	MEDICINE_ADDED_SUCCESSFULLY(200, "Medicine has been added successfully"),
	MEDICINE_ADDED_SUCCESSFULLY_AGAINST_USER(200, "Medicine has been added against the user successfully"),
	MEDICINE_UPDATED_SUCCESSFULLY(200, "Medicine has been updated successfully"),
	MEDICINE_DOES_NOT_EXIST(404, "Medicine does not exist"),
	TRIAL_DOES_NOT_EXIST(404, "Trial does not exist"),
	MEDICINE_MIN_MAX_NOT_SPECIFIED_CORRECTLY(400, "Temperature range min/max values not provided correctly"),
	MEDICINE_ALREADY_EXISTS(400, "A medicine with the same name already exists"),
	MEDICINE_USER_DELETED_SUCCESSFULLY(200, "User medicine deleted successfully"),
	MEDICINE_SUPPORTED_ADDED_SUCCESSFULLY(200,"Supported medicine added successfully"),
	MEDICINE_SUPPORTED_DELETED_SUCCESSFULLY(200,"Supported medicine deleted successfully"),
	MEDICINE_NOT_A_SUPPORTED_MEDICINE(400, "The medicine is not a supported medicine"),
	MEDICINE_IS_ATTACHED_TO_SHIPMENT(400, "Medicine can not be deleted as its part of some shipment."),
	MEDICINE_IS_ATTACHED_TO_TRIAL(400, "Medicine can not be deleted as its part of some trial."),
	MEDICINE_NOT_IN_INVENSOR(400, "The specified user medicine could not be removed from the system, as it was not assoicated with the provided invensor"),

	MEDICINE_USER_NOT_ASSOCIATED(400, "The medicine is not associated to the user"),
	MEDICINE_SUPPORTED_ID_INVALID(400, "Invalid supported medicine id"),
	MEDICINE_ID_OR_INVENSOR_ID_INVALID(400, "Invalid Invensor or medicine id"),
	MEDICINE_ALREADY_ASSOCIATED_WITH_USER(400, "Medicine with same name is already associated with the user"),
	MEDICINE_ITEM_ID_AND_NAME_COULD_BE_CROSS_VERIFIED(400, "Medicine item ID and name could not be cross verified"),
	MEDICINE_MIN_TEMP_CANNOT_BE_GREATER_THAN_MAX_TEMP(400, "Medicine min temp cannot be greater than max temp."),

	CAREGIVER_ADDED(200, "Caregiver has been added to your account. An email has been sent to the caregiver for approval"),
	CAREGIVER_ASSOCIATION_EXISTS(400, "Caregiver already associated with user"),
	CAREGIVER_EMAIL_SENT(200, "An email was sent to the caregiver to confirm their acceptance"),
	CAREGIVER_EMAIL_RESENT(200, "An email was re-sent to the caregiver to confirm their acceptance"),
	CAREGIVER_REGISTRATION_CONFIRMED(200, "Thank you for accepting. You have now been registered as a caregiver"),
	CAREGIVER_USER_NOT_ASSOCIATED(400, "The specified careGiverId is not associated to the user"),
	CAREGIVER_THIS_AND_USER_NOT_ASSOCIATED(400, "The following caregiver(s) is/are not associated to the user: "),
	CAREGIVER_USER_ASSOCIATION_REMOVED(200, "The specified caregiver has been removed from the list of user's caregivers"),
	CAREGIVER_DOES_NOT_EXIST(400, "The specified caregiver does not exist"),
	CAREGIVER_THIS_DOES_NOT_EXIST(400, "The following caregiver(s) do not exist: "),
	CAREGIVER_NOTIFIED_ALL(200,"All associated caregivers have been notified"),
	CAREGIVER_EMAIL_FAILED(500, "Email notification to the following caregiver(s) failed:"),
	CAREGIVER_ALREADY_ACCEPTED(400, "Caregiver has already accepted the job. No email sent"),
	CAREGIVER_CANNOT_BE_ADDED_TO_INACTIVE_USER(400, "Caregiver cannot be added to an inactive user"),
	CAREGIVER_NONE_ACTIVE(200, "Notification can not be sent as caregiver(s) is/are inactive"),
	CAREGIVER_NONE_ADDED(200, "No caregiver added against the user"),
	CAREGIVER_NOT_UPDATED_AS_NOT_ACCEPTED(400, "Caregiver cannot be updated as he/she hasn't accepted the invitation yet"),
	CAREGIVER_EMAIL_ALREADY_ASSOCIATED(400, "An existing caregiver with the same email address already exists"),
	CAREGIVER_UPDATED_AND_EMAIL_SENT(200, "Caregiver details have been updated and confirmation email has been sent to the new email address"),
	CAREGIVER_EMAIL_ALREADY_VALIDATED(400, "You have already validated your email address and registered yourself as a caregiver."),

	FNAME_CANNOT_BE_NULL(400, "First name cannot be null or empty"),

	FIRMWARE_FILE_EMPTY(400, "Firmware file cannot be empty"),
	DEVICE_FIRMWARE_NOT_EXIST(400, "No device firmware exists against this macAddress"),
	TEMPERATURE_SCALE_NOT_EXIST(400, "Temperature scale doesn't exist"),
	DEVICE_FIRMWARE_ALREADY_EXIST(400, "Device firmware already exists against this macAddress"),
	DEVICE_RANGE_ADDED_SUCCESSFULLY(200,"Device range added successfully"),
	TEMPERATURE_SCALE_ALREADY_EXIST(400, "Temperature scale already exists against this user"),
	FIRMWARE_SOFTWARE_VERSION_OLD(400, "The provided software version is older. Either same or a newer software version already exists"),
	FIRMWARE_VERSION_ID_OLD(400, "The provided firmware version is older. Either same or a newer firmware version already exists"),
	FIRMWARE_UPLOADED_SUCCESSFULLY(200, "The firmware has been created successfully"),
	FIRMWARE_NOT_UPLOADED(404, "No firmware file was found on the server"),
	FIRMWARE_NOT_FOUND(404, "Firmware not found"),
	FIRMWARE_VERSION_INVALID(400, "Firmware version is invalid"),
	FIRMWARE_EXISTS_WITH_SAME_NAME(400, "A firmware with the same name already exists"),
	FIRMWARE_REMOVED_SUCCESSFULLY(200, "Firmware removed successfully"),
	FIRMWARE_UPLOAD_FAILED(403, "User is Unauthrized to upload Firmware"),

	REMINDER_ASSOCIATED_MEDICAL_ITEM_ID_MISSING(400, "The provided typecode suggests a medicine but no medicine id has been provided in input"),
	REMINDER_TIMESTAMP_MISSING(400, "Please provide a proper time for reminder"),
	REMINDER_ADDED(200, "Reminder has been added successfully"),
	REMINDER_ID_MISSING(400, "Reminder id is missing or is invalid"),
	SUBJECT_ID_MISSING(400, "Subject id is missing or is invalid"),
	REMINDER_NOT_FOUND(404, "Reminder not found"),
	REMINDER_UPDATED(200, "Reminder has been updated successfully"),
	REMINDER_DELETED(200, "Reminder has been deleted successfully"),
	REMINDER_USER_NOT_ASSOCIATED(400,"The reminder id provided is not linked to the user"),
	REMINDER_ASSOCIATED_MEDICAL_ITEM_ID_MUST_BE_ZERO(400, "Blood sugar reminder must not have an associated medical item id."),
	REMINDER_INVENSOR_NOT_ASSOCIATED(400, "No reminder has been found against the provided invensor id"),
	REMINDER_TYPECODE_INVALID(400, "Reminder typecode is invalid"),
	REMINDER_TYPECODE_NOT_ASSOCIATED(400, "No caregiver associate with this typecode"),
	REQUEST_ALREADY_APPROVED(404, "The request is already approved"),

//	REMINDER_ASSOCIATED_MEDICAL_ITEM_ID_MISSING(400, "The associated medical item id must be provided as the reminder is not blood sugar related"),

	BLOODSUGAR_ADDED_SUCCESSFULLY(200, "Blood sugar reading added successfully"),
	BLOODSUGAR_START_TIME_MUST_BE_LESSER_THAN_END_TIME(400, "'Start time' must not be greater than end time"),

	TEST_STRIP_SUPPORTED_ID_INVALID(400, "Invalid supported test strip id"),
	TEST_STRIP_ALREADY_EXISTS(400, "Test strip with the same name already exist"),
	TEST_STRIP_ADDED_SUCCESSFULLY_AGAINST_USER(200, "Test strip added successfully against user"),
	TEST_STRIP_SUPPORTED_ADDED_SUCCESSFULLY(200, "Supported test strip added successfully"),
	TEST_STRIP_DELETED_SUCCESSFULLY(200, "Test strip deleted successfully"),
	TEST_STRIP_NOT_ASSOCIATED_TO_USER(400, "The specified user test strip is not assoicated with the provided user"),
	TEST_STRIP_NOT_A_SUPPORTED_TEST_STRIP(400, "The test strip is not a supported test strip"),
	TEST_STRIP_SUPPORTED_DELETED_SUCCESSFULLY(200, "Supported test strip deleted successfully"),
	TEST_STRIP_UPDATED_SUCCESSFULLY(200, "Test strip updated successfully"),
	TEST_STRIP_ID_MISSING(400, "test strip id missing"),
	TEST_STRIP_DOES_NOT_EXIST(400, "Test strip not found"),
	TEST_STRIP_ALREADY_ASSOCIATED_WITH_USER(400, "Test strip with the same name is already associated with the user"),
	TEST_STRIP_ITEM_ID_AND_NAME_COULD_BE_CROSS_VERIFIED(400, "Test strip item ID and name could not be cross verified"),
	TEST_STRIP_USER_NOT_ASSOCIATED(400, "The test strip is not associated to the user"),

	GLUCOMETER_SUPPORTED_ID_INVALID(400, "Invalid supported glucometer id"),
	GLUCOMETER_ALREADY_EXISTS(400, "Glucometer with the same name already exists"),
	GLUCOMETER_MIN_MAX_NOT_SPECIFIED_CORRECTLY(400 , "Temperature range min/max values not provided correctly"),
	GLUCOMETER_ADDED_SUCCESSFULLY(200,"Glucometer has been added successfully"),
	GLUCOMETER_ADDED_SUCCESSFULLY_AGAINST_USER(200, "Glucometer added successfully against user"),
	GLUCOMETER_SUPPORTED_REMOVED_SUCCESSFULLY(200, "Supported glucometer removed successfully"),
	GLUCOMETER_NOT_A_SUPPORTED_GLUCOMETER(400, "The glucometer is not a supported glucometer"),
	GLUCOMETER_USER_DELETED_SUCCESSFULLY(200, "User glucometer deleted successfully"),
	GLUCOMETER_USER_NOT_ASSOCIATED(400, "The Glucometer is not associated to the specified user"),
	GLUCOMETER_ID_MISSING(400, "Glucometer id missing"),
	GLUCOMETER_UPDATED_SUCCESSFULLY(200, "Glucometer updated successfully"),
	GLUCOMETER_DOES_NOT_EXIST(404, "Glucometer not found"),
	GLUCOMETER_ALREADY_ASSOCIATED_WITH_USER(400, "Glucometer with the same name is already associated with the user"),
	GLUCOMETER_ITEM_ID_AND_NAME_COULD_BE_CROSS_VERIFIED(400, "Glucometer item ID and name could not be cross verified"),

	SIDE_EFFECT_SUPPORTED_ADDED_SUCCESSFULLY(200, "Side effect added successfully"),
	SIDE_EFFECT_DOES_NOT_EXIST(404, "Side effect does not exist"),
	SIDE_EFFECT_SUPPORTED_ID_INVALID(400, "Invalid supported side effect id"),
	SIDE_EFFECT_ADDED_SUCCESSFULLY_AGAINST_USER_MED(200, "Side effect(s) added successfully against user medicine"),
	SIDE_EFFECT_USER_MEDICINE_ALREADY_EXISTS(400, "Side effect with the same name already exists"),
	SIDE_EFFECT_NOT_A_SUPPORTED_SIDE_EFFECT(400, "Side effect is not a supported side effect"),
	SIDE_EFFECT_SUPPORTED_REMOVED_SUCCESSFULLY(200, "Supported side effect removed successfully"),
	SIDE_EFFECT_USER_REMOVED_SUCCESSFULLY(200, "User side effect(s) deleted successfully"),
	SIDE_EFFECT_NOT_ASSOCIATED_TO_USER_MEDICINE(400, "The side effect is not associated to the user medicine"),
	SIDE_EFFECT_ID_MISSING(400, "SideEffect id missing"),
	SIDE_EFFECT_SUPPORTED_UPDATED_SUCCESSFULLY(200, "Supported side effect updated successfully"),
	SIDE_EFFECT_UPDATED_SUCCESSFULLY(200, "Side effect updated successfully"),
	SIDE_EFFECT_ALREADY_EXISTS(400, "Side effect already exists"),
	SIDE_EFFECT_ID_LIST_CANNOT_BE_EMPTY(400, "sideEffect IDs list cannot be empty"),

	FEELING_ADDED_SUCCESSFULLY(200, "User feeling(s) added successfully"),
	FEELING_START_TIME_MUST_BE_LESS_THAN_END_TIME(400, "'Start time' should not be greater than end time"),

	NOTIFICATION_ADDED_SUCCESSFULLY(200, "Notification(s) added successfully"),
	NOTIFICATION_NOT_PRESENT(400, "Notification does not exist"),
	NOTIFICATION_UPDATED_SUCCESSFULLY(200, "Notification updated successfully"),
	NOTIFICATION_REMOVED_SUCCESSFULLY(200, "Notification has been removed successfully"),
	NOTIFICATION_START_TIME_MUST_BE_LESS_THAN_END_TIME(400, "'Start time' should not be greater than end time"),
	NOTIFICATION_ITEM_ID_AND_NAME_MUST_BE_EMPTY(400, "Notification item ID and name must be empty in case of blood sugar"),
	NOTIFICATION_USER_NOT_ASSOCIATED(400, "Notification not associated to the user"),
	NOTIFICATION_TYPECODE_MUST_NOT_BE_EMPTY(400, "Notification typecode must not be empty"),

	REPORT_UPLOADED_SUCCESSFULLY(200, "Report has been saved successfully"),
	REPORT_NOT_FOUND(404, "Report not found"),
	REPORT_USER_NOT_ASSOCIATED(400, "The provided report is not associated to the user"),
	REPORT_REMOVED_SUCCESSFULLY(200, "Report has been removed successfully"),
	REPORT_TOTAL_DELIVERY_FAILURE_AGAINST_NON_CG_RECIPIENT(400, "Report not saved as no email could be sent to any recipient"),
	REPORT_TOTAL_DELIVERY_FAILURE_AGAINST_CG_RECIPIENT(400, "Report is not sent to any active caregiver"),
	REPORT_RECEIVED_BY_ALL_ACTIVE_CAREGIVERS(200,"Report is sent to all active caregivers"),
	REPORT_NOT_SENT_AS_NO_ACTIVE_CAREGIVER(200, "Report can not be sent as you have no active caregivers."),
	REPORT_UPDATED_SUCCESSFULLY(200, "Report has been updated successfully"),

	APPLICATION_VERSION_ADDED_SUCCESSFULLY(200, "Application version has been added successfully"),
	APPLICATION_VERSION_INVALID(400, "Application version invalid"),
	APPLICATION_VERSION_ID_OLD(400, "The provided application version is older. Either same or a newer application version already exists"),
	APPLICATION_VERSION_PLATFORM_INCORRECT(400, "Platform is incorrect. Please choose between either 'ios' or 'android' "),
	MAC_ADDRESS_INCORRECT(500, "Mac Address is Incorrect "),
	MAC_ADDRESS_MISMATCH(403, "Mac Address in Request and in Temprature should be same"),

	TRIAL_DELETED_SUCCESSFULLY(200,"Trial deleted successfully"),
	SUBJECTID_NOT_MATCH(404, "The specified subject id does not match"),
	SHIPPER_RE_USED(404, "This Shipper is re-used by admin. Latest shipment is not assigned to you."),
	SHIPPER_NOT_EXISTS(404, "The specified shipper does not exist"),
	LOGGER_NOT_EXISTS(404, "The specified logger does not exist"),
	SHIPPER_ALREADY_EXISTS(404, "Shipper with the same name already  exist"),
	SHIPPMENT_NOT_EXISTS(404, "The specified shippment does not exist"),
	TRIAL_IS_ASSOCIATED_WITH_SHIPPMENT(404, "The specified trial is associated with a shipment"),
	VIEWER_NOT_EXISTS(404, "The specified viewer does not exist"),
	VIEWER_NOT_ASSOCIATED(404, "No viewer associated with this subject id"),
	SUBJECT_NOT_EXIST(404, "No subject exists against this viewer"),
	SHIPPMENT_UPDATED(200, "Shippment has been updated successfully"),
	VIEWER_UPDATED(200, "Viewer has been updated successfully"),
	SHIPPER_EXIST (200, "Pass code has been verified"),
	LOGGER_PASSCODE_VALID (200, "Pass code has been verified"),
	INCOREECT_PASSCODE (404, "Incorrect Passcode"),
	TRIAL_NOT_EXISTS(404, "The specified trial does not exist"),
	SHIPPER_ALREADY_IN_PROCESS(404, "This shipper is already in process"),
	READING_INTERVAL_NOT_EXISTS(404, "The specified reading interval does not exist"),
	SUBJECT_EMAIL_ALREADY_EXIST(400, "This user is not a viewer"),
	ALARM_NOT_EXIST(404, "The Alarm Type does not exist"),
	NOT_A_ALARMTYPE(404, "Only Notification of  Alarm Type can be Acknowledge"),
	LOGS_NOT_FOUND_IN_RANGE(200, "No records found in the specified range"),
	EVENT_NOT_EXIST(404, "The Event Type does not exist"),




	DUPLICATE_USER_ASSOCIATION(400, "This user is already Associated with this Mac Address"),
	USER_HAS_NO_RIGHTS_TO_ASSOCIATE(400, "Current user has no rights to associate other user"),
	USER_TRY_TO_ASSOCIATE_HIMSELF(400, "You cant associate yourself again"),
	SUCCESFULLY_SENT_PASSCODE(200,"Passcode has been sent to the specified email address"),
	ASSOCIATION_NOT_FOUND(400, "MacAddress is not Associatted with any account"),
	USER_ASSOCIATION_NOT_FOUND(400, "User is not Associatted with given MacAddress"),
	USER_NOT_AUTHORIZED(400, "User is not AUTHORIZED for this operation"),
	SUBJECT_NOT_EXIST_AGAINST_MAC(404, "No subject exists against provided Mac Address"),
	ADMIN_CAN_NOT_BE_ASSIGNED_SHIPPMETN(404, "Admin can not be assigned a shipment."),
	PAIRING_REQUEST_ALREADY_SENT(404, "You have already sent pairing request.Please wait for approval and try again"),


	LOCATION_ADDED(200,"Locations has been successfully added against the specified user"),	;

	int statusCode;
	String message;

	private Status(int statusCode, String message) {
		this.statusCode = statusCode;
		this.message = message;
	}

	private Status() {

	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
