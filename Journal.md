# Journal
Phase 1
Since we want Artifact objects to be considered equal by id only regardless of name and era we
have to override the equals method to make sure comparing two objects doesn't return false.
The swap with last removal technique operates in O(1) complexity, whereas shifting elements
will operate in O(N) complexity making the performance much slower.
