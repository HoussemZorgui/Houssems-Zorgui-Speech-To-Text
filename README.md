# 𝙷𝙾𝚄𝚂𝚂𝙴𝙼_𝙵𝙻𝚄𝚃𝚃𝙴𝚁_𝚂𝙿𝙴𝙴𝙲𝙷 _𝚃𝙾 _𝚃𝙴𝚇𝚃
## **Speech-to-Text, Text-to-Speech & AI Chatbot**

**Developed by**: **Houssem Zorgui**  
**GitHub Repo**: [Houssems-Zorgui-Speech-To-Text](https://github.com/HoussemZorgui/Houssems-Zorgui-Speech-To-Text)

---

### 🚀 **Project Description**

This Android application, built with Kotlin and Jetpack Compose, provides useful features for **Speech-to-Text (STT)** and **Text-to-Speech (TTS)**.

#### **Text-to-Speech (TTS) Feature**
The Text-to-Speech API, available through the `android.speech.tts` package, allows the app to convert text into speech without requiring Google services.  
Users can:
- Input text using the keyboard in a text box.
- Import a saved text file for reading aloud.
- Adjust the voice pitch and speech rate to their preference.
- Listen to the synthesized text through the device's speaker.

#### **Speech-to-Text (STT) Feature**
Google’s Speech Recognition service is integrated using an Intent-based API, allowing the app to convert speech into text.  
Users can:
- Record their voice through the device’s microphone.
- View the captured speech converted into text on the screen.
- Save the converted text into a `.txt` file.
- Access and read the saved files later.

---

### **Key Features**
- **Speech-to-Text (STT)**: Converts user’s speech to text for easy interaction.
- **Text-to-Speech (TTS)**: Reads the AI-generated response back to the user.
- **AI Chatbot**: Uses **OpenAI GPT** to generate responses in real-time.
- **Simple Interface**: Text field and microphone button to easily communicate with the app.

---

### ⚡ **Technologies Used**
- **Programming Language**: **Kotlin** for native Android development.
  - Kotlin Version: **1.7.0**
- **Jetpack Compose** for modern UI development.
  - Compose UI Version: **1.3.3**
- **Libraries Used**:
  - **Google Speech API** for Speech-to-Text and Text-to-Speech.
  - **OpenAI GPT** for AI response generation.
- **User Interface**: Built using **Jetpack Compose** for modern, responsive design.
- **Platform**: Android (Tested on both emulator and real devices).
  - Android SDK Version: **33**
  - Min SDK: **27**
  - Target SDK: **33**

---

### 📋 **Prerequisites**
Before running the project, ensure you have the following installed:
- **Android Studio** (with Kotlin support).
- **Google Cloud Account** to enable the Speech-to-Text and Text-to-Speech APIs.
- **Google Cloud API Key**: Required for using Google's services.
- **OpenAI API Key**: For interacting with OpenAI's GPT model.

---

### 🛠️ **Installation and Setup**

1. **Clone the Git Repository**:

   ```bash
   git clone https://github.com/HoussemZorgui/Houssems-Zorgui-Speech-To-Text.git
   cd Houssems-Zorgui-Speech-To-Text
