# Caesar-Cipher

[![Build Status](https://github.com/D-Kumar19/Caesar-Cipher/actions/workflows/ci-build.yaml/badge.svg)](https://github.com/D-Kumar19/Caesar-Cipher/actions/workflows/ci-build.yaml)
[![Coverage Status](https://img.shields.io/badge/coverage-95%25-brightgreen)](https://github.com/D-Kumar19/Caesar-Cipher/actions/workflows/ci-build.yaml)

A simple implementation of the Caesar Cipher in Java, including encryption, decryption, and unit tests.

## Features

- Encrypt and decrypt messages using Caesar Cipher
- Support for uppercase, lowercase, and negative offsets
- Handles edge cases like empty or null messages
- Unit tests with high code coverage

## Usage

### Build

```bash
mvn clean install
````

### Run

```bash
java -jar target/CaesarCipher-1.0-SNAPSHOT.jar cipher "Hello World" 3
java -jar target/CaesarCipher-1.0-SNAPSHOT.jar decipher "Khoor Zruog" 3
```

Or using Docker:

```bash
docker run ttl.sh/caesar-cipher-<some-tag> cipher "Hello World" 3
```

### Test

```bash
mvn test
```

### Code Coverage

To generate and view the code coverage report:

```bash
mvn clean verify
open target/site/jacoco/index.html
```

## GitHub Actions

* CI is configured to build, test, verify coverage, and publish a Docker image to ttl.sh on every push to `master`.

## License

[LICENSE](./LICENSE)
