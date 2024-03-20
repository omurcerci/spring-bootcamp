package GameProject;

public class GamerManager implements IGamerService{
	
	// Bir sınıfın içerisinde başka bir sınıfı kullanacak isek. Asla onu newleme.
	private IUserValidationService userValidationService;
	
	public GamerManager(IUserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}
	
	

	public GamerManager() {
		super();
	}



	@Override
	public void add(Gamer gamer) {
		if(userValidationService.Validate(gamer) == true) {
			System.out.println("Kayıt oldu");
		}
		else {
			System.out.println("Doğrulama başarısız. Kayıt başarısız.");
		}
		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println("Kayıt güncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kayıt silindi");
		
	}

}
