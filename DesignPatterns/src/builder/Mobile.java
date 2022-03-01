package builder;

public class Mobile {

	private final Boolean waterproof;
	private final int batteryCapacity;
	private final String serviceWarranty;
	private final String dropProtection;
	
	public Mobile(Builder builder) {
		this.waterproof = builder.waterproof;
		this.batteryCapacity = builder.batteryCapacity;
		this.serviceWarranty = builder.serviceWarranty;
		this.dropProtection = builder.dropProtection;
	}
	
	@Override
	public String toString() {
		return "Mobile [waterproof=" + waterproof + ", batteryCapacity=" + batteryCapacity + ", serviceWarranty="
				+ serviceWarranty + ", dropProtection=" + dropProtection + "]";
	}

	static class Builder {
		
		private Boolean waterproof;
		private int batteryCapacity;
		private String serviceWarranty;
		private String dropProtection;

		public Mobile build() {
			return new Mobile(this);
		}
		
		public Builder(int batteryCapacity) {
			this.batteryCapacity = batteryCapacity;
		}
		
		public Builder waterproof(Boolean waterproof) {
			this.waterproof = waterproof;
			return this;
		}
		
		public Builder serviceWarranty(String serviceWarranty) {
			this.serviceWarranty = serviceWarranty;
			return this;
		}
		
		public Builder dropProtection(String dropProtection) {
			this.dropProtection = dropProtection;
			return this;
		}
		
	}
	
}
