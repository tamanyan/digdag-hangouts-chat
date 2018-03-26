# digdag-hangouts-chat

[![](https://jitpack.io/v/tamanyan/digdag-hangouts-chat.svg)](https://jitpack.io/#tamanyan/digdag-hangouts-chat)

## Description

digdag-hangouts-chat is a plugin sending messages to Hangouts Chat.
It can customize yaml templates for building messages.

## Features

- Can use the `hangouts>` opetaror
- Easy to use
- Flexible templates

## Requirement

- [Digdag](https://www.digdag.io/)
- Hangouts Chat
  - Webhook URL [(Incoming WebHooks)](https://developers.google.com/hangouts/chat/how-tos/webhooks)

## Usage
Also, you can see expamle workflow at [sample](https://github.com/tamanyan/digdag-hangouts-chat/tree/master/sample) directory.


3. Runs workflow
  ```console
  $ digdag run -a hangouts.dig
  ```

## Author

[Taketo Yoshida](https://twitter.com/TamaObject12)

## License

[Apache License 2.0](LICENSE)
