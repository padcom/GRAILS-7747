class HomeController {
	def index = {
		session.invalidate()
		[ message: "home/index" ]
	}

	def config = {
		[ message: "home/config", data: session.data ]
	}
}
