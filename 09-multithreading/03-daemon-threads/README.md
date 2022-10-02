## Daemon Threads

These threads run in background and do notprevent application from exiting if main thread terminates.

### Scenarios

- Background tasks, that should not block application from terminating like file saving thread in text editor.
- code in worker thread is not under our control, and we do not want it to block our application from terminating

  eg. Worker thread that uses an external library