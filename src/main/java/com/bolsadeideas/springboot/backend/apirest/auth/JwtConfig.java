package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\n" + 
			"MIIEpQIBAAKCAQEAwIhrhvEYVLDau7ULBfQmBvzZpoQHZs4ZQWe9+OWuF6zwHL0u\n" + 
			"jJqujqUlQQDeUqoARh0lZ5Px1w6n3SQr54iu0Q+yofd8EejZVSegcUHTDhiAl3OV\n" + 
			"pJeAJZ0J9MJKmHgX3RhqHXYnfxKSA8j5+wDVIK2WZdKXCLkwXMUAtWxON/fKlykm\n" + 
			"xYiPxt6Poplifg/eKO77W0M5f/aUSiCjPougj8aTQ2jGJdNKMeWIXVnwYcElEfve\n" + 
			"BURprTdRmaPMhXt1YFP/syGY0ILozUaXC4i52KM/VVNpSWEHzvHEyVoF530sbImT\n" + 
			"d0TgD2oLLQheV4a0m6D8n1kNXElhkTChB3oA7QIDAQABAoIBAQCn9tuHz9FgISHR\n" + 
			"2/GP8h0yv2fJwykJ4QdbbfvnpcgpU2/uQoTXmSJrw1sqyG0sRK8Ue9zj7cdvzJNZ\n" + 
			"c3Lx/OY18LHwZw3QOglQJs/rvnc3ttyIRAfqnVjod4X2B4I4XZzD/8ajiS6Px02n\n" + 
			"C7A579H/PjEVB5FHxPeSFzO1EpVycK8/4102zQhKR2trEje8M8FM6FwP0wi3npK4\n" + 
			"or0FmnBJ5vwp8FxgYrFTFc2jMJzSMbQGvS0f7tq9Df1jva1JKW1I+F5kp2qCuSPc\n" + 
			"ZKqZiSU4FHZtXyHgeGnI3LbOf+BUPV7CZeDKAGrD/ZlYeSWkC16WhDp7lyH0+O87\n" + 
			"NECJV9uBAoGBAPONbXeeGVkADsWlDO7L4f4jZu1rDYedtqm0cCMgH2HPnaQNGn70\n" + 
			"BXphZUwP3eDcG/kXXbg8GF2TiwWLzybYyaRQAvmIOvKlbWEJDRV8hMA2VWQ+EfAf\n" + 
			"8n4Tb1KqyskvZk2q6CMRWjWln0kvGVOxmQSC3xpEVGDTyncAtMW+1EH9AoGBAMpf\n" + 
			"d3ohSkTreaj4f+SsAutrI0TpuKk673ZHeAo7bANE6fGd7pvxRMFFt+gDPJGcBY4E\n" + 
			"hEkr5wAS736LUGAdzbNt8Z59VW17VR427/ZS1E28KLLiEsH+4DH8B2myNV5s91f5\n" + 
			"UdTpMX0AAOmQdIj5AnFpUF+jcvC8Is2RLPja+zWxAoGBAJABSX52roofLJzUUGdJ\n" + 
			"ieBYUl2C9McBC6YgGEXMkoGk3pLHZKk3451OxTRKFWkE/E018aYjckyyFns7BUr0\n" + 
			"15Ud8gRU9nXONnQvg9r2ew+jkK3qvXR7j0fYefQpJCn8qsK1kPhbJDmgKiR9gr4n\n" + 
			"vlAaiYvgZvuxfn8KndhmUt6JAoGBALhccEPawAY5XwQIHrr72U0OtXq6UXgaMLzY\n" + 
			"LwtjRutThKyQ7Cc0jSZllTzQdgVQ1d6jTsA6Np9ioLvvvrFRdWvY5R01oPW0Pb7g\n" + 
			"3YrRuod2urz8J4qD30qqBzbLGsODEXIbt+j26BawQiSFbSS7dPZMsuPty3B0dGBB\n" + 
			"uW6cT+6BAoGAcjZMImyn2jc/CCC6LLJwqRkH5Ward75UyQcN7H0IF1hOtdzRxY4s\n" + 
			"DpZrR+6qScsrW+OpXFd+gUx41eHig8zy2Y+ADLTlGN4kCc+x8EVV0bWMcATUw8Pr\n" + 
			"lihjbUZwyj+7pS0AcSNdHwpTBLzxZZ69mD0aQgu10CjTdi9oYGGcWz0=\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwIhrhvEYVLDau7ULBfQm\n" + 
			"BvzZpoQHZs4ZQWe9+OWuF6zwHL0ujJqujqUlQQDeUqoARh0lZ5Px1w6n3SQr54iu\n" + 
			"0Q+yofd8EejZVSegcUHTDhiAl3OVpJeAJZ0J9MJKmHgX3RhqHXYnfxKSA8j5+wDV\n" + 
			"IK2WZdKXCLkwXMUAtWxON/fKlykmxYiPxt6Poplifg/eKO77W0M5f/aUSiCjPoug\n" + 
			"j8aTQ2jGJdNKMeWIXVnwYcElEfveBURprTdRmaPMhXt1YFP/syGY0ILozUaXC4i5\n" + 
			"2KM/VVNpSWEHzvHEyVoF530sbImTd0TgD2oLLQheV4a0m6D8n1kNXElhkTChB3oA\n" + 
			"7QIDAQAB\n" + 
			"-----END PUBLIC KEY-----";
}
