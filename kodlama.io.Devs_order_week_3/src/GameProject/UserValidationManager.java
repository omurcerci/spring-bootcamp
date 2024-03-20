package GameProject;

public class UserValidationManager implements IUserValidationService{

	@Override
	public boolean Validate(Gamer gamer) {
		
		if(gamer.getBirthYear() == 1985 && gamer.getFirstName() == "Ömür" && gamer.getLastName() == "Çerçi" && gamer.getIdentityNumber() == 12345){
			return true;
		}
		else {
			return false;
		}
		
	}

}
