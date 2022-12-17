# NATO Alphabet Memorizer

This small FLOSS application will help you memorize
the [NATO Phonetic Alphabet](https://en.wikipedia.org/wiki/NATO_phonetic_alphabet)

# Features

# Signature

# Building

## Signed

The signed version (the one published to Github and PlayStore) can be built with:

```
./gradlew packageSignedReleaseUniversalApk
```

You must first decrypt secrets using `git secret reveal`

## Unsigned

If you're building an unsigned version, build the same one that goes to FDroid (as FDroid signs the
app themselves).

```
./gradlew packageReleaseUniversalApk
```

This approach doesn't require secrets.

## Git Secrets

The **Keystore**, **Keystore Properties** and **Google Play deploy json** files are included in the
repository using
[git secret](https://git-secret.io/). The current secret owners are:

- Leonardo Colman Lopes
    - Fingerprint `B3A5 9909 9ECC 4DB4 FD40 896F 7706 1922 C587 2792`
    - Original Author

# Release

## Google Play

## F-Droid

[<img src="https://fdroid.gitlab.io/artwork/badge/get-it-on.png"
     alt="Get it on F-Droid"
     height="80">](https://f-droid.org/packages/br.com.colman.nato/)

F-Droid release is maintained automatically by the F-Droid repository when we tag a new release. The
YAML file containing the Metadata can be
found [here](https://gitlab.com/fdroid/fdroiddata/-/blob/master/metadata/br.com.colman.nato.yml).

## Releases Page / Local

1. Decrypt all git secrets
2. Run `./gradlew packageSignedReleaseUniversalApk`

You can get an APK file from the [Releases Section](https://github.com/LeoColman/NATO-Alphabet-Memorizer/releases/latest).
