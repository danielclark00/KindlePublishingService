# Kindle Publishing Service

## The Problem: Amazon Kindle Publishing

The Amazon Kindle store provides millions of ebooks to our customers. The process of publishing an
ebook to the kindle catalog is currently an extremely manual process, which causes a long wait time
to add a book to the catalog.

As a member of the Amazon Kindle team, you will be launching a new service that allows our
publishing department to convert books into a digital format.

The overview, architecture, and implementation are covered in the [design document here](DESIGN_DOCUMENT.md). Almost all major pieces of software at Amazon first go through an intensive design
review to answer the question "Are we building the right thing for our customer?".

Carefully read the design document and refer back to it while working on the tasks.

## Project Mastery Tasks

#### Under each mastery task I have linked to parts of the project that are my code.  
### [Mastery Task 1: Killing me softly](tasks/MasteryTask01.md)

My Contributions:   
- [Class diagram](src/resources/mastery-task1-kindle-publishing-CD.puml)  
- [Sequence diagram](src/resources/mastery-task1-remove-book-SD.puml)
- [RemoveBookFromCatalogActivity](https://github.com/danielclark00/KindlePublishingService/commit/7746cf0d77b806d14ab9c1a170df19e97a3abde8#diff-425953d684a72c3bf3cfd03b7640ef448c58a593f6132aa59de3fdd966212fc4)
- [Soft Delete](https://github.com/danielclark00/KindlePublishingService/commit/7746cf0d77b806d14ab9c1a170df19e97a3abde8#diff-1e0d63a2b6ec3ceaca2b52a387c966bccffb587c829fa5528b1954afdb4b8845)  

### [Mastery Task 2: Submit to the process](tasks/MasteryTask02.md)

My Contributions:
- [BookPublishRequestManger](https://github.com/danielclark00/KindlePublishingService/commit/af48c173f31a68facf96fc668bf94ca8349da1fc#diff-3c757b9e81e5263a0dd748c2e810f90784f7895f29924fa9744bddaca6f6f936)
- [PublishingModule](https://github.com/danielclark00/KindlePublishingService/commit/af48c173f31a68facf96fc668bf94ca8349da1fc#diff-6bc374721e69142088e9589ab90032e1bf375a94ffb5b42e26e14178a938c8bd)
- [CatalogDao](https://github.com/danielclark00/KindlePublishingService/commit/af48c173f31a68facf96fc668bf94ca8349da1fc#diff-3c757b9e81e5263a0dd748c2e810f90784f7895f29924fa9744bddaca6f6f936)
- [SubmitBookForPublishingActivity](https://github.com/danielclark00/KindlePublishingService/commit/af48c173f31a68facf96fc668bf94ca8349da1fc#diff-f5d5e5e40d2b9c62c349e30f034f19af340d04d87ac52949a2b7a3df1ee6495f) 

### [Mastery Task 3: Query, query on the wall, don’t load one, get them all!](tasks/MasteryTask03.md)

My Contributions:
- [DynamoDB Query](https://github.com/danielclark00/KindlePublishingService/commit/00fc7feb7cd4ac2a4f199d435bd91b366b0b9955#diff-080d2cc0751fec25e3e85585253976ced2b787c2d1a81c7be0d36bd8d833ba36)
- [GetPublishingStatusActivity](https://github.com/danielclark00/KindlePublishingService/commit/00fc7feb7cd4ac2a4f199d435bd91b366b0b9955#diff-586e4556aa411ec8f844d7e4c434958616ae02970efed5659c1acf1c255a9bfd) 
- [PublishingStatusItemConverter](https://github.com/danielclark00/KindlePublishingService/commit/00fc7feb7cd4ac2a4f199d435bd91b366b0b9955#diff-a28698e34b6a18c6505399fca3fba8b1820ee0eaf5b98c187abaae1583359cb0)
- [CatalogDao](https://github.com/danielclark00/KindlePublishingService/commit/00fc7feb7cd4ac2a4f199d435bd91b366b0b9955#diff-1e0d63a2b6ec3ceaca2b52a387c966bccffb587c829fa5528b1954afdb4b8845)

### [Mastery Task 4: Make a run(nable) for it](tasks/MasteryTask04.md)

My Contributions:
- [BookPublishTask (Runnable)](https://github.com/danielclark00/KindlePublishingService/commit/cb8b10e1a8abf17c532c4bf2a03b8384b0a07f1b#diff-ea9c8983608e995deef7ac61cbefe364fc1a1a124813b25861b1ee8e2aadccce)
- [BookPublishingRequestManager(Updated for Thread Safety)](https://github.com/danielclark00/KindlePublishingService/commit/cb8b10e1a8abf17c532c4bf2a03b8384b0a07f1b#diff-3c757b9e81e5263a0dd748c2e810f90784f7895f29924fa9744bddaca6f6f936)
- [CatalogItemVersion](https://github.com/danielclark00/KindlePublishingService/commit/cb8b10e1a8abf17c532c4bf2a03b8384b0a07f1b#diff-72bba4dc8a786b645e87e1c9bb971ca6d784ad36d5336339aebc37b78bab8e68)
- [PublishingStatusDao](https://github.com/danielclark00/KindlePublishingService/commit/cb8b10e1a8abf17c532c4bf2a03b8384b0a07f1b#diff-080d2cc0751fec25e3e85585253976ced2b787c2d1a81c7be0d36bd8d833ba36)
- [CatalogDao](https://github.com/danielclark00/KindlePublishingService/commit/cb8b10e1a8abf17c532c4bf2a03b8384b0a07f1b#diff-1e0d63a2b6ec3ceaca2b52a387c966bccffb587c829fa5528b1954afdb4b8845)
- [PublishingModule](https://github.com/danielclark00/KindlePublishingService/commit/cb8b10e1a8abf17c532c4bf2a03b8384b0a07f1b#diff-6bc374721e69142088e9589ab90032e1bf375a94ffb5b42e26e14178a938c8bd)
- [DataAccessModule](https://github.com/danielclark00/KindlePublishingService/commit/cb8b10e1a8abf17c532c4bf2a03b8384b0a07f1b#diff-7a50e8b41a0b94192edfe7d9ec05008bea41c10dc5bf1faca3dcc9f1fc7598fd)
- [CatalogItemConverter](https://github.com/danielclark00/KindlePublishingService/commit/cb8b10e1a8abf17c532c4bf2a03b8384b0a07f1b#diff-5af56a37083f31ba967f5e87a57f2127ca6207dbb296e6eb033a2c3f35ecd634)


*note: This is a project adapted from Amazon Technical Academy by Bloomtech.*
