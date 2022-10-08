class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        for letter in ransomNote:
            if not letter in magazine:
                return False
            else:
                magazine = magazine.replace(letter, '', 1)
        return True
