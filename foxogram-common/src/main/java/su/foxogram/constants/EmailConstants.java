package su.foxogram.constants;

public class EmailConstants {
	public enum Type {
		RESET_PASSWORD("reset_password"),
		EMAIL_VERIFY("email_verify"),
		ACCOUNT_DELETE("account_delete");

		private final String type;

		Type(String type) {
			this.type = type;
		}

		public String getValue() {
			return type;
		}
	}
}
